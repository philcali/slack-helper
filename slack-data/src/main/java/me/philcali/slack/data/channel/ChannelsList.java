package me.philcali.slack.data.channel;

import java.util.List;

import me.philcali.slack.data.SlackData;

public class ChannelsList extends SlackData {
    private List<Channel> channels;

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }
}
