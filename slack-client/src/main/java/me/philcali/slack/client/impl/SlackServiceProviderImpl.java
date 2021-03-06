package me.philcali.slack.client.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import me.philcali.oauth.api.model.IClientConfig;
import me.philcali.slack.client.ISlackService;
import me.philcali.slack.client.ISlackServiceProvider;
import me.philcali.slack.data.EventData;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class SlackServiceProviderImpl implements ISlackServiceProvider {
    public static final String API_HOST = "slack.com";
    private final ObjectMapper mapper;
    private final IClientConfig config;

    public SlackServiceProviderImpl(final IClientConfig config) {
        this(config, new ObjectMapper());
    }

    public SlackServiceProviderImpl(final IClientConfig config, final ObjectMapper mapper) {
        this.config = config;
        this.mapper = mapper.copy();
        this.mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    @Override
    public <T> T convert(InputStream input, Class<T> inputClass) throws IOException {
        return mapper.readValue(input, inputClass);
    }

    @Override
    public <T> EventData<T> convertEvent(InputStream input, Class<T> inputClass) throws IOException {
        return mapper.readValue(input, mapper.getTypeFactory()
                .constructParametricType(EventData.class, inputClass));
    }

    @Override
    public ISlackService getService(Optional<String> accessToken) {
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .connectTimeout(config.getConnectTimeout(), TimeUnit.SECONDS)
                .readTimeout(config.getReadTimeout(), TimeUnit.SECONDS);

        // Add token as a query param to every web API call
        accessToken.ifPresent(token -> {
            client.addInterceptor(chain -> {
                return chain.proceed(chain.request().newBuilder()
                        .url(chain.request().url().newBuilder()
                                .addQueryParameter("token", token)
                                .build())
                        .build());
            });
        });

        Retrofit retrofit = new Retrofit.Builder()
                .client(client.build())
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .baseUrl(new HttpUrl.Builder()
                        .scheme("https")
                        .host(API_HOST)
                        .build())
                .build();

        return retrofit.create(ISlackService.class);
    }
}
