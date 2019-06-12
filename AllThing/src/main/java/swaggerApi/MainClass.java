package swaggerApi;

import com.google.gson.Gson;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import log4j2.LogAdapter;

import java.util.*;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 07/06/2019
 * Time: 9:39 AM
 */
public class MainClass {
    private final LogAdapter logger = LogAdapter.newInstance(this.getClass());

    public static void main(String[] args) {
        new MainClass().test();
    }

    private void test() {
        OpenAPI openAPI = new OpenAPI();
        openAPI.addTagsItem(new Tag().name("DBS").description("Digital banking system"));
        openAPI.addTagsItem(new Tag().name("BPM").description("unknown"));

        //swagger general info
        Info info = new Info();
        info.setTitle("Intelin swagger document");
        info.setVersion("1.0.0");
        Server server = new Server();
        server.setUrl("localhost:8080");
        openAPI.setServers(Collections.singletonList(server));
        openAPI.setInfo(info);

        //example api document
        Map<String, PathItem> hm = new HashMap<>();
        hm.put("/siro/api_a", new PathItem());
        //operation info
        PathItem p = hm.get("/siro/api_a");
        List<Operation> lstOperation = extractOperation(p);
        lstOperation.forEach(it -> it.setParameters(getParamsFromApi("/siro/api_a")));
        generateApi(hm);
        hm.forEach(openAPI::path);


        //component, example model
        openAPI.schema("siroSchema", new Schema()
                .title("siroTitle")
                .type("object")
                .required(Arrays.asList("ab", "cd"))
                .properties(new HashMap<>()));
        logger.trace(new Gson().toJson(openAPI));
    }

    private List<Operation> extractOperation(PathItem pathItem) {
        List<Operation> lst = new ArrayList<>();
        Operation operation = new Operation(); //some way to get operation
        pathItem.post(operation);//todo default demo is get
        lst.add(operation);
        return lst;
    }

    private List<Parameter> getParamsFromApi(String api) {
//        String[] split = api.split("\\/");
//        return Arrays.stream(split).filter(x -> x.startsWith(":")).map(x -> {
//            Parameter param = new Parameter();
//            param.name(x.substring(1));
//            return param;
//        }).collect(Collectors.toList());
        Parameter p1 = new Parameter().name("ss").required(true).schema(new Schema().type("string"));
        p1.setIn(ParameterIn.PATH.toString());
        Parameter p2 = new Parameter().name("xx").required(true).schema(new Schema().type("string"));
        p2.setIn(ParameterIn.PATH.toString());
        return Arrays.asList(p1, p2);
    }

    //
    private void generateApi(Map<String, PathItem> hm) {
        hm.forEach((key, value) -> {
            PathItem p = value;
            Operation matchedOperation = null;
            matchedOperation = p.getPost();
            //api info
            matchedOperation.setSummary("SIRO SUMARY");
            matchedOperation.description("SIRO DESCRIPTION");
            matchedOperation.operationId("SIRO OPERATION" + "_" + UUID.randomUUID().toString().substring(30));
            matchedOperation.deprecated(false);
            matchedOperation.setTags(Arrays.asList("DBS"));

            //todo mapping request api request-body info
            io.swagger.v3.oas.models.parameters.RequestBody rb = new io.swagger.v3.oas.models.parameters.RequestBody();
            Map<String, Object> map = new HashMap<String, Object>();
            mapParams(map);

            Schema model = new Schema();
            //model.setTitle("Ahahaha");
            model.setProperties(map);
//            model.required(Arrays.asList("uu", "yy", "xx"));
            model.setExample("{\"orgId\":\"0215\",\"orderName\":\"mua sach\",\"orderDescription\":\"mua truyen\",\"debitAccount\":\"002222545\",\"totalDebitAmount\":2500000,\"refKey\":\"ref_key\",\"isOverLevel\":1}");

            Content cont = new Content()
                    .addMediaType("application/json", new MediaType().schema(model));

            rb.setContent(cont);
            rb.setRequired(true);
            rb.description("body of request");
            //
            matchedOperation.requestBody(rb);
            //todo end mapping request

            //todo start mapping response
            ApiResponses responses = new ApiResponses();
            responses.put("200", new ApiResponse().description("OK"));
            responses.put("500", new ApiResponse().description("Internal server error"));
            ApiResponse ap = new ApiResponse();
            ap.setDescription("Default body response");
            Schema modelResponse = new Schema();
            modelResponse.setProperties(map);
            modelResponse.setExample("{\"orgId\":\"0215\",\"orderName\":\"mua sach\",\"orderDescription\":\"mua truyen\",\"debitAccount\":\"002222545\",\"totalDebitAmount\":2500000,\"refKey\":\"ref_key\",\"isOverLevel\":1}");
            ap.setContent(new Content()
                    .addMediaType("application/json",new MediaType().schema(modelResponse)));
            responses.put("201",ap);


            matchedOperation.responses(responses);
            //todo end mapping response

        });
    }

    //for implement class - create model in request body or response body
    private void mapParams(Map<String, Object> map) {
        Map<String, Object> m = new HashMap<>();
        m.put("type", "string");
        map.put("abc", m);
        map.put("def", m);

    }

}
