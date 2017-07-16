package me.philcali.slack.data;

public class UrlVerification {
    private String token;
    private String challenge;
    private String type;

    public String getChallenge() {
        return challenge;
    }

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setType(String type) {
        this.type = type;
    }
}
