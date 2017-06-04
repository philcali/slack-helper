package me.philcali.slack.data.oauth;

public class BotAuth {
    private String botUserId;
    private String botAccessToken;

    public String getBotAccessToken() {
        return botAccessToken;
    }

    public String getBotUserId() {
        return botUserId;
    }

    public void setBotAccessToken(String botAccessToken) {
        this.botAccessToken = botAccessToken;
    }

    public void setBotUserId(String botUserId) {
        this.botUserId = botUserId;
    }
}
