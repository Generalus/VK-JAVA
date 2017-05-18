package pro100denysko.command;


import com.vk.api.sdk.objects.users.User;
import ukr.pro100denysko.Token;

public class MiddleAgeCommand implements Command {
    private User user;
    String link = "https://api.vk.com/method/friends.addList?name=list?v=5.52&access_token=";
    Token token = new Token();


    public void execute() {

        String URLFriends = link + token.getAccess_token();

    }
}
