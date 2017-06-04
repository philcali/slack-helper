package me.philcali.slack.data.message;

public class Message {
    private String type;
    private String channel;
    private String user;
    private String text;
    private String ts;

    public String getChannel() {
        return channel;
    }

    public String getText() {
        return text;
    }

    public String getTs() {
        return ts;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
