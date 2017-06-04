package me.philcali.slack.data;

import java.util.List;

public class EventData<T> {
    private String token;
    private String teamId;
    private String apiAppId;
    private T event;
    private String eventTs;
    private String type;
    private List<String> authedUsers;

    public String getApiAppId() {
        return apiAppId;
    }

    public List<String> getAuthedUsers() {
        return authedUsers;
    }

    public T getEvent() {
        return event;
    }

    public String getEventTs() {
        return eventTs;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }

    public void setApiAppId(String apiAppId) {
        this.apiAppId = apiAppId;
    }

    public void setAuthedUsers(List<String> authedUsers) {
        this.authedUsers = authedUsers;
    }

    public void setEvent(T event) {
        this.event = event;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setType(String type) {
        this.type = type;
    }
}
