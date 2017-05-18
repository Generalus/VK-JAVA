package pro100denysko;

public class Token {
    String access_token = " token ";
    String authorizeUML = "https://oauth.vk.com/authorize?client_id=5490057&display=page&redirect_uri=&scope=friends&response_type=token&v=5.52";
    String log="https://api.vk.com/method/friends.getOnline?v=5.52&access_token=";

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
