package me.philcali.slack.data.message;

import me.philcali.slack.data.SlackData;

public class MessageData extends SlackData {
    private String channel;
    private String ts;

    public String getChannel() {
        return channel;
    }

    public String getTs() {
        return ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
