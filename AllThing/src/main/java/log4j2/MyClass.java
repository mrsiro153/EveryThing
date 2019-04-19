package log4j2;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 26/10/2018
 * Time: 11:41 AM
 */
public class MyClass {
    private LogAdapter l = LogAdapter.newInstance(this.getClass());

    public void printSt(){
        l.error("ERRROR");
    }
}
