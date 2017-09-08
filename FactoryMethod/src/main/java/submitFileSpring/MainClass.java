package submitFileSpring;

import io.vertx.core.json.JsonObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.support.ServletContextResource;

import java.io.File;

public class MainClass {
    private static String server = "http://test.ntex.vn/upload";
    //private String server ="http://localhost:9100";

    private RestTemplate rest;
    private HttpHeaders headers;
    private HttpStatus status;
    private String linkFile="/home/ndoan/Downloads/chonau.jpg";
    private static String linkFile2="/home/ndoan/Downloads/2017/8/8/2a076493-3d03-4921-b3f1-ae147e8f5b81.jpg";

    public MainClass() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        //headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        headers.add("device-id","gdfgfd");
        headers.add("token","hdsvsvbcv");
        headers.add("checking","doanNH");
    }

    public static void main(String[] args) {
        try {
            new MainClass().post3(server,linkFile2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //
    public String post2(String uri) throws Exception{
        //
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("file", new FileSystemResource(linkFile2));

        HttpEntity<MultiValueMap<String,Object>> requestEntity = new HttpEntity<MultiValueMap<String, Object>>(map, headers);
        //
        ResponseEntity<String> responseEntity = rest.exchange(server , HttpMethod.POST, requestEntity, String.class);
        System.out.println(responseEntity.getBody());
        return responseEntity.getBody();
    }
    //
    public String post3(String url,String filePath) throws Exception{
        //
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("file", new FileSystemResource(filePath));

        HttpEntity<MultiValueMap<String,Object>> requestEntity = new HttpEntity<MultiValueMap<String, Object>>(map, null);
        //
        ResponseEntity<String> responseEntity = restTemplate.exchange(url , HttpMethod.POST, requestEntity, String.class);
        System.out.println(responseEntity.getBody());
        return responseEntity.getBody();
    }
}
