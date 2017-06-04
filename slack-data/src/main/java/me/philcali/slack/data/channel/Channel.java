package me.philcali.slack.data.channel;

import java.util.List;
import java.util.Map;

import me.philcali.slack.data.Property;

public class Channel {
    private String id;
    private String name;
    private boolean channel;
    private long created;
    private String creator;
    private boolean archived;
    private boolean general;
    private boolean member;
    private boolean starred;
    private List<String> members;
    private Property topic;
    private Property purpose;
    private String lastRead;
    private Map<String, String> latest;
    private long unreadCount;
    private long unreadCountDisplay;

    public long getCreated() {
        return created;
    }

    public String getCreator() {
        return creator;
    }

    public String getId() {
        return id;
    }

    public String getLastRead() {
        return lastRead;
    }

    public Map<String, String> getLatest() {
        return latest;
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public Property getPurpose() {
        return purpose;
    }

    public Property getTopic() {
        return topic;
    }

    public long getUnreadCount() {
        return unreadCount;
    }

    public long getUnreadCountDisplay() {
        return unreadCountDisplay;
    }

    public boolean isArchived() {
        return archived;
    }

    public boolean isChannel() {
        return channel;
    }

    public boolean isGeneral() {
        return general;
    }

    public boolean isMember() {
        return member;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void setChannel(boolean channel) {
        this.channel = channel;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }

    public void setLatest(Map<String, String> latest) {
        this.latest = latest;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurpose(Property purpose) {
        this.purpose = purpose;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public void setTopic(Property topic) {
        this.topic = topic;
    }

    public void setUnreadCount(long unreadCount) {
        this.unreadCount = unreadCount;
    }

    public void setUnreadCountDisplay(long unreadCountDisplay) {
        this.unreadCountDisplay = unreadCountDisplay;
    }
}
