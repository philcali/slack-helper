package me.philcali.slack.data.user;

import me.philcali.oauth.api.model.IProfile;
import me.philcali.slack.data.SlackData;

public class Identity extends SlackData implements IProfile {
    private User user;
    private Team team;

    @Override
    public String getEmail() {
        return getUser().getEmail();
    }

    @Override
    public String getFirstName() {
        return getUser().getName().substring(0, getUser().getName().indexOf(' '));
    }

    @Override
    public String getId() {
        return getTeam().getId();
    }

    @Override
    public String getImage() {
        // TODO: really get the images here
        return null;
    }

    @Override
    public String getLastName() {
        return getUser().getName().substring(getUser().getName().indexOf(' '));
    }

    public Team getTeam() {
        return team;
    }

    public User getUser() {
        return user;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
