package me.philcali.slack.data;

import java.util.List;

public class Reaction {
    private String name;
    private long count;
    private List<String> users;

    public long getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
