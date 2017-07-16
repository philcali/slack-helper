package me.philcali.slack.client.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.StringJoiner;

import me.philcali.oauth.api.ClientConfig;
import me.philcali.oauth.api.IToken;
import me.philcali.oauth.api.exception.AuthException;
import me.philcali.slack.client.ISlackIntegration;
import me.philcali.slack.client.ISlackService;
import me.philcali.slack.client.ISlackServiceProvider;
import me.philcali.slack.client.exception.SlackServiceException;
import me.philcali.slack.data.EventData;
import me.philcali.slack.data.oauth.OAuthAccess;
import me.philcali.slack.data.user.Identity;
import okhttp3.HttpUrl;

public class SlackIntegrationImpl implements ISlackIntegration {
    private ISlackServiceProvider provider;
    private ClientConfig config;

    public SlackIntegrationImpl(final ClientConfig config) {
        this(config, new SlackServiceProviderImpl(config));
    }

    public SlackIntegrationImpl(final ClientConfig config, ISlackServiceProvider provider) {
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
    public OAuthAccess exchange(String code) throws AuthException {
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

    @Override
    public String getAuthUrl(String ... state) {
        StringJoiner scopes = new StringJoiner(",");
        config.getScopes().forEach(scopes::add);
        HttpUrl.Builder url = new HttpUrl.Builder()
                .host(SlackServiceProviderImpl.API_HOST)
                .scheme("https")
                .addEncodedPathSegment("oauth/authorize")
                .addQueryParameter("client_id", config.getClientId())
                .addEncodedQueryParameter("state", generateState(state))
                .addEncodedQueryParameter("scope", scopes.toString());
        Optional.ofNullable(config.getRedirectUrl()).ifPresent(redirect -> {
            url.addEncodedQueryParameter("redirect_uri", redirect);
        });
        return url.build().toString();
    }

    @Override
    public ISlackService getService(Optional<String> accessToken) {
        return provider.getService(accessToken);
    }

    @Override
    public Identity me(IToken token) throws AuthException {
        try {
            return provider.getService(token.getAccessToken()).usersIdentity().execute().body();
        } catch (IOException e) {
            throw new AuthException(e);
        }
    }
}
