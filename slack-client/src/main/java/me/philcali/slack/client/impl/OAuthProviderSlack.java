package me.philcali.slack.client.impl;

import me.philcali.oauth.api.IAuthManager;
import me.philcali.oauth.api.model.IClientConfig;
import me.philcali.oauth.spi.AbstractOAuthProvider;

public class OAuthProviderSlack extends AbstractOAuthProvider {
    private static final String TYPE = "slack";

    @Override
    public String getApiType() {
        return TYPE;
    }

    @Override
    protected IAuthManager lazilyCreate(final IClientConfig config, final String... params) {
        return new SlackIntegrationImpl(config);
    }
}
