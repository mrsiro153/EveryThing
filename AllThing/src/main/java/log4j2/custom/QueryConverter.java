package log4j2.custom;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.*;
//

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 02/04/2019
 * Time: 4:20 PM
 */
@Plugin(name = "query", category = "Converter")
@ConverterKeys({"t", "query"})
public final class QueryConverter extends LogEventPatternConverter {

    public QueryConverter(String name, String style) {
        super(name, style);
    }

    public QueryConverter(String[] options) {
        super("aa","bb");
    }

    public static QueryConverter newInstance(final String[] options) {
        return new QueryConverter(options);
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo) {
        toAppendTo.append("ffdsfdsfdsfdsfds");
    }
}
//@Plugin(name = "ClassNamePatternConverter", category = PatternConverter.CATEGORY)
//@ConverterKeys({ "C", "class" })
//public final class ClassNamePatternConverter extends NamePatternConverter {
//
//    private static final String NA = "?";
//
//    /**
//     * Private constructor.
//     *
//     * @param options options, may be null.
//     */
//    private ClassNamePatternConverter(
//            final String[] options) {
//        super("Class Name", "class name", options);
//    }
//
//    /**
//     * Gets an instance of ClassNamePatternConverter.
//     *
//     * @param options options, may be null.
//     * @return instance of pattern converter.
//     */
//    public static ClassNamePatternConverter newInstance(final String[] options) {
//        return new ClassNamePatternConverter(options);
//    }
//
//    /**
//     * Format a logging event.
//     *
//     * @param event      event to format.
//     * @param toAppendTo string buffer to which class name will be appended.
//     */
//    @Override
//    public void format(final LogEvent event, final StringBuilder toAppendTo) {
//        final StackTraceElement element = event.getSource();
//        if (element == null) {
//            toAppendTo.append(NA);
//        } else {
//            abbreviate(element.getClassName(), toAppendTo);
//        }
//    }
//}

