package log4j2;

import java.util.UUID;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 02/04/2019
 * Time: 2:27 PM
 */
public class Generator {
    public static String generateIdLog(LogType type) {
        String prefix = "";
        switch (type) {
            case CORE:
                return type.getType() + generate();
            case END_USER:
                return type.getType() + generate();
            case AUTO:
                return type.getType()+generate();
            default:
                return generate();
        }
    }
    private static String generate() {
        UUID idGenerate = UUID.randomUUID();
        return idGenerate.toString().replaceAll("-", "");
    }
}
