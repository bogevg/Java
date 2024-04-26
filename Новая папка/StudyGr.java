

import java.util.ArrayList;
import java.util.List;

public class StudyGr {
    public List<Student> listStudents;
    public Teacher teacher;
    public int number;

    StudyGr(){
        this.listStudents = new ArrayList<>();
    }

    @Override
    public String toString() {
        String s= "StudyGr: \n students: ";

        for (Student stt : listStudents) {
            s = s + stt.name + ", "; 
        }
        s = s + "\n"+"teacher: " + teacher.name+ "\n";
        return super.toString();
    }
    
}