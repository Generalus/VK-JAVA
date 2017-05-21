package com.vksoftware.javastatistics.res;

public class Token {
    private static Token token;
    private static String accessToken = "";

    String authorizeUML = "https://oauth.vk.com/authorize?client_id=5490057&display=page&redirect_uri=&scope=friends&response_type=token&v=5.52";
    String log = "https://api.vk.com/method/friends.getOnline?v=5.52&accessToken=";


    public static Token getAccessToken() {
        if (token == null) {
            token = new Token();
            return token;
        } else {
            throw new UnsupportedOperationException("Необходимо указать токен");
        }
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}