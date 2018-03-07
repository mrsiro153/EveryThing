package submitFileHttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import sun.applet.Main;

import java.io.File;

public class MainClass {
    private static final String SAMPLE_URL = "https://www.a.com/";

    public static void main(String[] args) throws Exception{
        MainClass m = new MainClass();
        m.sendMessageToGoogle();
    }

    public void sendMessageToGoogle(){
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = client.execute(new HttpGet(SAMPLE_URL));
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(Thread.currentThread().getName());
            System.out.println(statusCode);
            System.out.println("Thread: "+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void sendWithFileBody(){
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost("http://localhost:9100/image");
            post.addHeader("device-id", "ffsdgdfgdhf");
            post.addHeader("token", "tokengfd");
            post.addHeader("checking", "doannfdds");
            File file = new File("/home/ndoan/Downloads/gautruc.jpg");
            String message = "This is a multipart post";
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            builder.addBinaryBody
                    ("upfile", file, ContentType.DEFAULT_BINARY, "/home/ndoan/Downloads/gautruc.jpg");
            builder.addTextBody("text", message, ContentType.TEXT_PLAIN);
            HttpEntity entity = builder.build();
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println(response.getEntity().getContent().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
