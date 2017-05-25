package com.vksoftware.javastatistics;

import com.google.gson.Gson;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppContext {

    private static AppContext instance;

    private UserActor actor;
    private VkApiClient vk;
    private Properties properties;

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

        return properties.getProperty("token");

    }


    private Integer askUserId() {


        return Integer.parseInt(properties.getProperty("user_id"));
    }

    private Properties getUserProperties() {

        FileInputStream fis;
        properties = new Properties();
        try {
            fis = new FileInputStream("src/main/resources/user.properties");
            properties.load(fis);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        return properties;
    }

}


