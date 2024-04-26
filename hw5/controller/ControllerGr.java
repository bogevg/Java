public class ControllerGr {
    private StudyGrService studyService = new StudyGrService();

    public void addGr(StudyGr group){
        studyService.addGr(group);
    }

    public void getStudentrGr(StudyGr group){
        for ( Student student : group.listStudents) {
            System.out.println(student);
        }
    }
}
