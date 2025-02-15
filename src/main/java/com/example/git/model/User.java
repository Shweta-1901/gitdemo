package com.example.git.model;

public class User {

    private int userid;
    private String userName;
    private String email;
    private int userAge;

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserid() {
        return userid;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {""
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
