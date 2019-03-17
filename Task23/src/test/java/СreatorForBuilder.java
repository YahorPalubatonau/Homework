import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class СreatorForBuilder {
    private static final String ACESS_TOKEN = "access_token";

    static URIBuilder createBuilder(String method) {
        URIBuilder builderForGetAllMessage = null;
        try {
            builderForGetAllMessage = new URIBuilder(String.format(("https://api.vk.com/method/wall.%s?"), method));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        builderForGetAllMessage.setParameter(ACESS_TOKEN, "56ef8805d3dcbc2c6d1fb7ffbcb048ed6e81bf36cf9b1caa4518d8051047f6a2472629edebd145e59037f")
                .setParameter("owner_id", "21117163")
                .setParameter("v", "5.92");
        return builderForGetAllMessage;
    }

    static String getPostID(URIBuilder builderForCommit) {
        HttpGet request = null;
        try {
            request = new HttpGet(builderForCommit.build());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        response.getStatusLine().getStatusCode();
        String postId = null;
        try {
            postId = (EntityUtils.toString(response.getEntity())).substring(23, 26);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return postId;
    }

    public static HttpResponse getResponse(URIBuilder builder) {
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = null;
        HttpGet request = null;
        try {
            request = new HttpGet(builder.build());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        try {
            response = client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

}
