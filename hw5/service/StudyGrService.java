import java.util.ArrayList;
import java.util.List;

public class StudyGrService {
    List<StudyGr> studyGrList;

    StudyGrService(){
        this.studyGrList = new ArrayList<>();
    }

    public void addGr(StudyGr group){
        studyGrList.add(group);
    }

    public StudyGr StudyGrpor(Teacher teacher, List<Student> students, int number){
        StudyGr newGroup = new StudyGr();
        newGroup.teacher = teacher;
        newGroup.listStudents = students;
        newGroup.number = number;
        return newGroup;
    }

    
    
}