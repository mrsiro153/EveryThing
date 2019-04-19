package log4j2;

import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 26/10/2018
 * Time: 11:15 AM
 */
public class LogAdapter {
    private final Logger logger;
    private static final String _logger_signal = "{}";
    private static final String _line = "%line%";
    private static final String _message = "%message%";
    private static final String _exception = "%exception%";
    private static final String _threadName = "%threadName%";
        private final String pattern_normal = "[id: " + _threadName + "] [line: " + _line + "] - " + _message;
    private final String pattern_exception = "[id: " + _threadName + "] [line: " + _line + "] - Error: " + _exception + " - " + _message;
    private final String pattern_only_exception = "[id: " + _threadName + "] [line: " + _line + "] - Error: " + _exception;
//    private final String pattern_normal = "[line: " + _line + "] - Message: " + _message;
//    private final String pattern_exception = "[line: " + _line + "] - Error: " + _exception + " - Message: " + _message;
//    private final String pattern_only_exception = "[line: " + _line + "] - Error: " + _exception;

    public String idLog = "";


    public static <T> LogAdapter newInstance(Class<T> instance) {
        return new LogAdapter(instance);
    }

    public void setIdRequest(String idRequest) {
        if (idRequest == null || idRequest.isEmpty()) {
            //logger.warn("idLog not found - do not set idLog");
            //collation is null or empty - do nothing
            return;
        }
        String name = Thread.currentThread().getName();
        for (LogType it : LogType.values()) {
            if (name.contains(it.getType())) return;
        }
        Thread.currentThread().setName(name + " " + idRequest);
    }

    public void setIdRequest(JsonObject payload, CommonRequest request) {
        String threadName = Thread.currentThread().getName();
        for (LogType it : LogType.values()) {
            if (threadName.contains(it.getType())) return;
        }
        String idRequest = "";
        if (payload.get("idRequest") == null || payload.get("idRequest").getAsString().isEmpty()) {
            if (States.isNotNull(request) && States.isNotNull(request.getHeader()) && !States.isNullOrEmpty(request.getHeader().getIdRequest()))
                idRequest = request.getHeader().getIdRequest();
        } else {
            idRequest = payload.get("idRequest").getAsString();
        }
        this.setIdRequest(idRequest);
    }

    public void setIdRequest(JsonObject payload, CommonResponse response) {
        String threadName = Thread.currentThread().getName();
        for (LogType it : LogType.values()) {
            if (threadName.contains(it.getType())) {
                return;
            }
        }
        String idRequest = "";
        if (payload.get("idRequest") == null || payload.get("idRequest").getAsString().isEmpty()) {
            if (States.isNotNull(response) && States.isNotNull(response.getHeader()) && !States.isNullOrEmpty(response.getHeader().getIdRequest()))
                idRequest = response.getHeader().getIdRequest();
        } else {
            idRequest = payload.get("idRequest").getAsString();
        }
        this.setIdRequest(idRequest);
    }

    public String getIdRequest() {
        String currentName = Thread.currentThread().getName();
        try {
            return currentName.substring(currentName.length() - 37);
            //37 = generator.length + refix
        } catch (Exception e) {
            return "";
        }
    }

    private <T> LogAdapter(Class<T> instance) {
        logger = LogManager.getLogger(instance);
    }
    //

    public <T extends Throwable> void error(T e) {
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        String name = Thread.currentThread().getName();
        String log = pattern_only_exception
                .replace(_line, currentLine.toString())
                .replace(_exception, e.getClass() + " " + e.getMessage())
                .replace(_threadName, name);
        logger.error(log);
        logger.error(e);
    }

    public void error(String message) {
        message = checkNull(message);
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        String name = Thread.currentThread().getName();
        String log = pattern_normal.replace(_line, currentLine.toString()).replace(_message, message).replace(_threadName, name);
        logger.error(log);
    }

    public <T extends Throwable> void error(T e, String message) {
        message = checkNull(message);
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        String name = Thread.currentThread().getName();
        String log = pattern_exception
                .replace(_line, currentLine.toString()).replace(_message, message)
                .replace(_exception, e.getClass() + " " + e.getMessage())
                .replace(_threadName, name);
        logger.error(log);
    }

    public void error(String message, Object... lstObject) {
        message = checkNull(message);
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        String name = Thread.currentThread().getName();
        String log = pattern_normal
                .replace(_line, currentLine.toString())
                .replace(_message, message)
                .replace(_threadName, name);
        logger.error(log, lstObject);
    }

    public <T extends Throwable> void error(T e, String message, Object... lstObject) {
        message = checkNull(message);
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        String name = Thread.currentThread().getName();
        String log = pattern_exception
                .replace(_line, currentLine.toString())
                .replace(_message, message)
                .replace(_exception, e.getClass() + " " + e.getMessage())
                .replace(_threadName, name);
        logger.error(log, lstObject);
    }

    //
    public void warn(Object message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.warn(pattern_normal
                .replace(_message, message.toString())
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void warn(String message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.warn(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void warn(String message, Object... lstObject) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.warn(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name), lstObject);
    }

    //
    public void info(Object message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.info(pattern_normal
                .replace(_message, message.toString())
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void info(String message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.info(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void info(String message, Object... lstObject) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.info(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name), lstObject);
    }

    //
    public void debug(Object message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.debug(pattern_normal
                .replace(_message, message.toString())
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void debug(String message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.debug(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void debug(String message, Object... lstObject) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.debug(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name), lstObject);
    }

    //
    public void trace(Object message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.trace(pattern_normal
                .replace(_message, message.toString())
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void trace(String message) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.trace(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name));
    }

    public void trace(String message, Object... lstObject) {
        message = checkNull(message);
        String name = Thread.currentThread().getName();
        Integer currentLine = Thread.currentThread().getStackTrace()[2].getLineNumber();
        logger.trace(pattern_normal
                .replace(_message, message)
                .replace(_line, currentLine.toString())
                .replace(_threadName, name), lstObject);
    }

    private String checkNull(Object param) {
        if (param == null) return "null";
        return param.toString();
    }

    //
    public void ds() {
        org.apache.logging.log4j.core.Logger coreLogger = (org.apache.logging.log4j.core.Logger) logger;
        Map m  = coreLogger.getAppenders();
        for(Object o : m.values()){
            if(o instanceof ConsoleAppender){
                ConsoleAppender consoleAppender = (ConsoleAppender) o;
                for (Object o1: consoleAppender.getLayout().getContentFormat().values()){
                    System.out.println("------  "+o1);
                }
            }
        }
    }

}
