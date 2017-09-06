package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        try {
            // String to be scanned to find the pattern.
            String line = "ascfsdAAAAf4556";
            String pattern = "[\\w@.]";
            //String pattern = "(\\w)(\\.)(\0.\@)";
            boolean b = line.matches(pattern);
            System.out.println("gfgdf: "+b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
