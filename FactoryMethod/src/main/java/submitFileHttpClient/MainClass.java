package submitFileHttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;

public class MainClass {
    public static void main(String[] args) throws Exception{
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("http://localhost:9100/image");
        post.addHeader("device-id","ffsdgdfgdhf");
        post.addHeader("token","tokengfd");
        post.addHeader("checking","doannfdds");
        File file = new File("/home/ndoan/Downloads/gautruc.jpg");
        String message = "This is a multipart post";
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addBinaryBody
                ("upfile", file, ContentType.DEFAULT_BINARY, "/home/ndoan/Downloads/gautruc.jpg");
        builder.addTextBody("text", message, ContentType.TEXT_PLAIN);
//
        HttpEntity entity = builder.build();
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        System.out.println(response.getEntity().getContent().toString());

    }
}
