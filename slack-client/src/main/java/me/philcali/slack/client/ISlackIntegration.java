package me.philcali.slack.client;

import me.philcali.slack.data.oauth.OAuthAccess;

public interface ISlackIntegration extends ISlackServiceProvider {
    String getAuthUrl(String ... state);

    OAuthAccess login(String code);

    default String[] parseStates(String state) {
        return state.split(":");
    }
}
