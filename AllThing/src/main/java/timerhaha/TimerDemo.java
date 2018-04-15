package timerhaha;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Each 2mnt, I will print: "+new Date().toString());
            }
        }, 1000, 120000);
    }
}
