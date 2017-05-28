package com.vksoftware.javastatistics.command;


import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vksoftware.javastatistics.AppContext;

import java.util.List;


public class MiddleAgeCommand implements Command {

    public void execute() {
        AppContext context = AppContext.getInstance();
        VkApiClient vk = context.getVk();
        UserActor actor = context.getActor();

        //считать средний возраст друзей юзера
        try {

            List list = vk.friends().get(actor).execute().getItems();
            list.toArray();

            System.out.println(vk.users().get(actor).userIds(list).fields().execute());
        } catch (Exception e) {
            e.printStackTrace();
        }

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