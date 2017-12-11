package processAPI;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {

    public static void main(String[] args) throws Exception{
        MainClass m = new MainClass();
        m.currentPercentRam();
    }
    //
    public void processDemo() throws Exception{
        Process proc = Runtime.getRuntime().exec(new String[] {
                "/bin/sh",
                "-c",
                "echo $PPID"
        });
        String pid = printToConsole(proc);
        System.out.println("Your pid is " + pid);

    }
    //
    public void currentPercentOfCPU()throws Exception{
        Process proc = Runtime.getRuntime().exec(new String[] {
                "/bin/sh",
                "-c",
                "grep 'cpu ' /proc/stat | awk '{usage=($2+$4)*100/($2+$4+$5)} END {print usage \"%\"}'"
                //"echo $PPID"
        });
        String s = printToConsole(proc);
        System.out.println("Your %CPU is: "+s);
    }
    public String printToConsole(Process proc){
        try {
            if (proc.waitFor() == 0) {
                InputStream in = proc.getInputStream();
                int available = in.available();
                byte[] outputBytes = new byte[available];

                in.read(outputBytes);
                String pid = new String(outputBytes);

                return pid;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    //
    public void currentPercentRam()throws Exception{
        Process proc = Runtime.getRuntime().exec(new String[] {
                "/bin/sh",
                "-c",
                "free -m | grep Mem | awk '{usage=($7*100/$2)} END {print usage \"%\"}'"
        });
        String s = printToConsole(proc);
        System.out.println("Your %FreeRam is: "+s);
    }

}
