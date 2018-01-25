package me.philcali.slack.data.oauth;

import me.philcali.oauth.api.model.IToken;
import me.philcali.slack.data.SlackData;

public class OAuthAccess extends SlackData implements IToken {
    private static final String APPLICATION = "SLACK";
    private static final String TOKEN_TYPE = "request";

    private String accessToken;
    private String scope;
    private String teamName;
    private String teamId;
    private WebhookAuth incomingWebhook;
    private BotAuth bot;

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public String getApi() {
        return APPLICATION;
    }

    public BotAuth getBot() {
        return bot;
    }

    public WebhookAuth getIncomingWebhook() {
        return incomingWebhook;
    }

    public String getScope() {
        return scope;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getTokenType() {
        return TOKEN_TYPE;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setBot(BotAuth bot) {
        this.bot = bot;
    }

    public void setIncomingWebhook(WebhookAuth incomingWebhook) {
        this.incomingWebhook = incomingWebhook;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
