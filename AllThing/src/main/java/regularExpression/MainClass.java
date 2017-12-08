package regularExpression;


import java.util.regex.Pattern;

public class MainClass {
    private static final String pattern = "^([a-zA-Z0-9.@ ]*)$";//include a->z , A->Z, 0->9, . , @, space

    //email [local-part]@[domainName]
    //local-part 3-> no limit characters, a-z 0-9, Accept special characters, no space
    //domain name: 5-no limit characters, a-z 0-9, Accept special only (not 1st or last character): . : - Doc is required
    private static final String pattern1 = "([^.@][a-z0-9A-Z!#$%&'*-+/=?^_`{|}~.][^.]{3,})@([^.][a-z0-9A-Z:.\\-]{5,}[^.])";

    //alphanumeric
    //at least 1 capitalize or special character, no space
    private static final String pattern2 = "[a-zA-Z0-9!#$%&'*-+/=?^_`{|}~.]?=([0-9]+|[!#$%&'*-+/=?^_`{|}~.]+){6,35}$";

    private static final String pattern3 = "^([a-z0-9]([!@#$]|[A-Z])*){6,35}$";
    private static final String pattern4 =".{32,256}";

    public static void main(String[] args) {
        try {
            // String to be scanned to find the pattern.
            //String testString = "!#$%^@gmail.com";
            String testString ="!&fd0s-ld";

            boolean b = testString.matches(pattern4);
            System.out.println("Result: "+b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Pattern test = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
}
