package res;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Authorize {

   /* String URL1 = "https://api.vk.com/method/users.get?user_ids=";
    String URL2 = "&fields=bdate&v=5.64";
    int index = 26154686;
    String URLIndex = URL1 + index + URL2;*/
    int index = 26154686;
    String URLIndex = String.format("https://api.vk.com/method/users.get?user_ids=", index, "&fields=bdate&v=5.64");
    HttpURLConnection connection = null;

    public void connector() {
        try {
            connection = (HttpURLConnection) new URL(URLIndex).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);

            connection.connect();

            StringBuilder sb = new StringBuilder();
            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String line;
                while ((line = bf.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                System.out.println(sb.toString());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
