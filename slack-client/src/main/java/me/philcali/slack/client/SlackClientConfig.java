package me.philcali.slack.client;

import java.util.ArrayList;
import java.util.List;

public class SlackClientConfig {
    private static final String DEFAULT_HOST = "slack.com";
    private static final int DEFAULT_CONNECT_TIMEOUT = 5;
    private static final int DEFAULT_READ_TIMEOUT = 30;

    private String clientId;
    private String clientSecret;
    private String redirectUrl;
    private List<String> scopes;
    private int connectTimeout = DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = DEFAULT_READ_TIMEOUT;
    private String host = DEFAULT_HOST;

    public SlackClientConfig addScope(String scope) {
        getScopes().add(scope);
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public String getHost() {
        return host;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public List<String> getScopes() {
        if (scopes == null) {
            scopes = new ArrayList<>();
        }
        return scopes;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public SlackClientConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    public SlackClientConfig withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    public SlackClientConfig withConnectTimeout(int connectTimeout) {
        setConnectTimeout(connectTimeout);
        return this;
    }

    public SlackClientConfig withHost(String host) {
        setHost(host);
        return this;
    }

    public SlackClientConfig withReadTimeout(int readTimeout) {
        setReadTimeout(readTimeout);
        return this;
    }

    public SlackClientConfig withRedirectUrl(String redirectUrl) {
        setRedirectUrl(redirectUrl);
        return this;
    }

    public SlackClientConfig withScopes(List<String> scopes) {
        setScopes(scopes);
        return this;
    }
}
