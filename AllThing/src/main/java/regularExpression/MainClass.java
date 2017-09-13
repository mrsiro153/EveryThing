package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        try {
            // String to be scanned to find the pattern.
            String line = "";
            String pattern = "^([a-zA-Z0-9.@ ]*)$";
            //include a->z , A->Z, 0->9, . , @, space
            boolean b = line.matches(pattern);
            System.out.println("gfgdf: "+b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
