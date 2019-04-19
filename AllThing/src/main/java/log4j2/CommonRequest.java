package log4j2;

import com.google.gson.JsonObject;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 02/04/2019
 * Time: 2:32 PM
 */
public class CommonRequest {
    private JsonObject data ;
    private HeaderInternalRequest header;

    public JsonObject getData() {
        return data;
    }

    public CommonRequest setData(JsonObject data) {
        this.data = data;
        return this;
    }

    public HeaderInternalRequest getHeader() {
        return header;
    }

    public CommonRequest setHeader(HeaderInternalRequest header) {
        this.header = header;
        return this;
    }
}
