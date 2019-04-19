package log4j2;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 02/04/2019
 * Time: 2:15 PM
 */
public enum LogType {
    END_USER("USER_"), CORE("CORE_"),AUTO("AUTO_");
    private String type;
    LogType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
