package designPattern.behavioral.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass{
    private final Logger logger = LogManager.getLogger(this.getClass());

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student st1 = new Student();
        Student st2 = new Student();
        teacher.addStudent(st1).addStudent(st2);
        teacher.changeStatus(TeacherStatus.UNKNOWN);
        //

    }
}
