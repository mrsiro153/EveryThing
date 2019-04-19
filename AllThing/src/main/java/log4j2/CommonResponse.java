package log4j2;

import com.google.gson.JsonElement;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 02/04/2019
 * Time: 2:32 PM
 */
public class CommonResponse {
    private Integer code;
    private JsonElement data;
    private HeaderInternalRequest header;

    public Integer getCode() {
        return code;
    }

    public CommonResponse setCode(Integer code) {
        this.code = code;
        return this;
    }

    public JsonElement getData() {
        return data;
    }

    public CommonResponse setData(JsonElement data) {
        this.data = data;
        return this;
    }

    public HeaderInternalRequest getHeader() {
        return header;
    }

    public CommonResponse setHeader(HeaderInternalRequest header) {
        this.header = header;
        return this;
    }
}
