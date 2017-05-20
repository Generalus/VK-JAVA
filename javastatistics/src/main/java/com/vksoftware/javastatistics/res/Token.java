package com.vksoftware.javastatistics.res;

public class Token {
    String accessToken = " ";
    String authorizeUML = "https://oauth.vk.com/authorize?client_id=5490057&display=page&redirect_uri=&scope=friends&response_type=token&v=5.52";
    String log = "https://api.vk.com/method/friends.getOnline?v=5.52&accessToken=";

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}