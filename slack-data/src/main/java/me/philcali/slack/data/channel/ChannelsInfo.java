package me.philcali.slack.data.channel;

import me.philcali.slack.data.SlackData;

public class ChannelsInfo extends SlackData {
    private Channel channel;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
