package com.vksoftware.javastatistics.res;

public class Token {
    String accessToken="5074ca51d1a7c2527f6190b53dfddd2eade83b8760ac72b9ccb78f5f71d5c313f5c83e4507662acb61d7";
    String authorizeUML = "https://oauth.vk.com/authorize?client_id=5490057&display=page&redirect_uri=&scope=friends&response_type=token&v=5.52";
    String log = "https://api.vk.com/method/friends.getOnline?v=5.52&accessToken=";


    public String getAccessToken() {
        if (accessToken == null) {
            return accessToken;
        } else {
            throw new UnsupportedOperationException("Необходимо указать токен");
        }
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}