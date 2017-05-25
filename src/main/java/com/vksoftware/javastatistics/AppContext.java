package com.vksoftware.javastatistics;


import com.google.gson.Gson;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AppContext {

    private static AppContext instance;
    private UserActor actor;
    private VkApiClient vk;
    private Integer userid = Integer.parseInt(getUserPropertie().getProperty("user_id"));
    private String userToken = getUserPropertie().getProperty("token");
    private AppContext() {
        TransportClient transportClient = HttpTransportClient.getInstance();
        vk = new VkApiClient(transportClient, new Gson());
        actor = new UserActor(askUserId(), askToken());
    }

    public static AppContext getInstance() {
        if (instance == null) {
            instance = new AppContext();
        }
        return instance;
    }

    public static void clear() {
        instance = null;
    }

    public UserActor getActor() {
        return actor;
    }

    public VkApiClient getVk() {
        return vk;
    }

    private String askToken() {

        return userToken;

    }


    private Integer askUserId() {


        return userid;
    }

    private Properties getUserPropertie() {

        FileInputStream fis;
        Properties property = new Properties();
        try {
            fis = new FileInputStream("src/main/resources/user.properties");

        } catch (FileNotFoundException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        return property;
    }

}


