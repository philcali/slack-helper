package me.philcali.slack.data.bot;

import java.util.Map;

public class Bot {
    private String id;
    private String appId;
    private String name;
    private boolean deleted;
    private Map<String, String> icons;

    public String getAppId() {
        return appId;
    }

    public Map<String, String> getIcons() {
        return icons;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setIcons(Map<String, String> icons) {
        this.icons = icons;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
