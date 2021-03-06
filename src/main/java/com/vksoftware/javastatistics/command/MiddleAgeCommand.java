package com.vksoftware.javastatistics.command;


import com.vk.api.sdk.client.Lang;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.users.UserField;
import com.vksoftware.javastatistics.AppContext;


public class MiddleAgeCommand implements Command {

    public void execute() {
        AppContext context = AppContext.getInstance();
        VkApiClient vk = context.getVk();
        UserActor actor = context.getActor();

        /*

        try {


            ПРИМЕР 1: получаем день рождения владельца токена
            System.out.println(vk.users().get(actor).userIds(actor.getId().toString()).fields(UserField.COUNTERS, UserField.BDATE)
                    .lang(Lang.EN).execute().get(0).getBdate());

            ПРИМЕР 2: получаем количество друзей онлайн владельца токена
            System.out.println(vk.friends().getOnline(actor).execute().size());


        } catch (Exception e) {
            e.printStackTrace();
        }

        */

    }
}
