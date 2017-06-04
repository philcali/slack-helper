package me.philcali.slack.data.oauth;

public class WebhookAuth {
    private String url;
    private String channel;
    private String configurationUrl;

    public String getChannel() {
        return channel;
    }

    public String getConfigurationUrl() {
        return configurationUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setConfigurationUrl(String configurationUrl) {
        this.configurationUrl = configurationUrl;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
