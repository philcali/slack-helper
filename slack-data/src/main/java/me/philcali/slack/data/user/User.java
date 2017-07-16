package me.philcali.slack.data.user;

import java.util.Map;

public class User {
    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private Map<String, String> profile;
    private boolean admin;
    private boolean owner;
    private long updated;
    private String email;

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getProfile() {
        return profile;
    }

    public long getUpdated() {
        return updated;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void setProfile(Map<String, String> profile) {
        this.profile = profile;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
