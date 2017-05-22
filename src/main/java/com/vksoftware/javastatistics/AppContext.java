package com.vksoftware.javastatistics;


import com.google.gson.Gson;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;

public class AppContext {

    private UserActor actor;
    private VkApiClient vk;


    private static AppContext instance;

    public static AppContext getInstance() {
        if (instance == null) {
            instance = new AppContext();
        }
        return instance;
    }

    private AppContext() {
        TransportClient transportClient = HttpTransportClient.getInstance();
        vk = new VkApiClient(transportClient, new Gson());
        actor = new UserActor(askUserId(), askToken());
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
        throw new java.lang.UnsupportedOperationException("еще не реализовано");
        // TODO: return "read value from properties";
    }


    private Integer askUserId() {
        throw new java.lang.UnsupportedOperationException("еще не реализовано");
        //TODO: return read value from properties;
    }

}
