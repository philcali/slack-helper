package me.philcali.slack.client;

import me.philcali.oauth.api.IAuthManager;
import me.philcali.oauth.api.model.IToken;
import me.philcali.slack.data.oauth.OAuthAccess;
import me.philcali.slack.data.user.Identity;

public interface ISlackIntegration extends ISlackServiceProvider, IAuthManager {
    @Override
    OAuthAccess exchange(String code);

    @Override
    Identity me(IToken token);
}
