package com.vksoftware.javastatistics.res;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.users.User;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class First {

    TransportClient transportClient = HttpTransportClient.getInstance();
    VkApiClient vkApiClient = new VkApiClient(transportClient);

    User user = new User();
    //GroupActor groupActor=

    public void init() throws IOException {
       // int userID = user.getId();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://api.vk.com/method/users.get?user_ids=210700286&fields=bdate&v=5.64");
        CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpGet);

    }

}
