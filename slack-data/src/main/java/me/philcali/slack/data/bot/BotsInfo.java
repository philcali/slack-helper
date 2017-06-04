package me.philcali.slack.data.bot;

import me.philcali.slack.data.SlackData;

public class BotsInfo extends SlackData {
    private Bot bot;

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }
}
