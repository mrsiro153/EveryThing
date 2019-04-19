package jooqDemo.test;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 22/11/2018
 * Time: 9:22 AM
 */
public enum FeeStatus {
    DISABLE(0, "disable"),
    ENABLE(1, "enable");

    private Integer code;
    private String description;

    FeeStatus(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
