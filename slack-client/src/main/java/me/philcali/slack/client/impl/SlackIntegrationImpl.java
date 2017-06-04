package me.philcali.slack.client.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.StringJoiner;

import me.philcali.slack.client.ISlackIntegration;
import me.philcali.slack.client.ISlackService;
import me.philcali.slack.client.ISlackServiceProvider;
import me.philcali.slack.client.SlackClientConfig;
import me.philcali.slack.client.exception.SlackServiceException;
import me.philcali.slack.data.EventData;
import me.philcali.slack.data.oauth.OAuthAccess;
import okhttp3.HttpUrl;

public class SlackIntegrationImpl implements ISlackIntegration {
    private ISlackServiceProvider provider;
    private SlackClientConfig config;

    public SlackIntegrationImpl(SlackClientConfig config) {
        this(config, new SlackServiceProviderImpl());
    }

    public SlackIntegrationImpl(SlackClientConfig config, ISlackServiceProvider provider) {
        this.config = config;
        this.provider = provider;
    }

    @Override
    public <T> T convert(InputStream input, Class<T> inputClass) throws IOException {
        return provider.convert(input, inputClass);
    }

    @Override
    public <T> EventData<T> convertEvent(InputStream input, Class<T> inputClass) throws IOException {
        return provider.convertEvent(input, inputClass);
    }

    @Override
    public String getAuthUrl(String ... state) {
        StringJoiner scopes = new StringJoiner(" ");
        config.getScopes().forEach(scopes::add);
        HttpUrl.Builder url = new HttpUrl.Builder()
                .host(config.getHost())
                .scheme("https")
                .addEncodedPathSegment("oauth/authorize")
                .addQueryParameter("client_id", config.getClientId())
                .addQueryParameter("scopes", scopes.toString());
        Optional.ofNullable(config.getRedirectUrl()).ifPresent(redirect -> {
            url.addQueryParameter("redirect_uri", redirect);
        });
        return url.build().toString();
    }

    @Override
    public ISlackService getService(Optional<String> accessToken) {
        return provider.getService(accessToken);
    }

    @Override
    public OAuthAccess login(String code) {
        try {
            return provider.getService().oauthAccess(
                    config.getClientId(),
                    config.getClientSecret(),
                    code,
                    config.getRedirectUrl()).execute().body();
        } catch (IOException e) {
            throw new SlackServiceException(e);
        }
    }
}
