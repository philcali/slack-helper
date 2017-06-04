package me.philcali.slack.data;

public class Property {
    private String value;
    private String creator;
    private long lastSet;

    public String getCreator() {
        return creator;
    }

    public long getLastSet() {
        return lastSet;
    }

    public String getValue() {
        return value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setLastSet(long lastSet) {
        this.lastSet = lastSet;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
