package com.roomy.app;

public class MatchesObject {
    private String userId;
    private String name;
    public MatchesObject(String userId, String name) {

        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {

        this.userId = userId;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {

        this.name = name;
    }
}
