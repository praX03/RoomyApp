package com.roomy.app.Matches;

public class MatchesObject {
    private String userId;
    private String name;
    private String profileImageUrl;

    public MatchesObject(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }
    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getProfileImageUrl(){
        return profileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl){
        this.profileImageUrl = profileImageUrl;
    }
}