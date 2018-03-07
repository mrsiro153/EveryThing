package designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Student> lstStudent;

    public Teacher() {
        lstStudent = new ArrayList<>();
    }

    public Teacher addStudent(Student st){
        lstStudent.add(st);
        return this;
    }
    public void removeLastStudent(){
        lstStudent.remove(lstStudent.size()-1);
    }

    public void changeStatus(TeacherStatus teacherStatus){
        for(Student st : lstStudent){
            st.update(teacherStatus);
        }
    }
}
