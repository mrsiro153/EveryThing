package recentBill;

import com.google.gson.JsonObject;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 13/03/2019
 * Time: 9:25 AM
 */
public class CommonResp {
    private String code;
    private String message;
    private JsonObject data;

    public String getCode() {
        return code;
    }

    public CommonResp setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResp setMessage(String message) {
        this.message = message;
        return this;
    }

    public JsonObject getData() {
        return data;
    }

    public CommonResp setData(JsonObject data) {
        this.data = data;
        return this;
    }
}
