public class ViewGr {
    private ControllerGr controllerGr = new ControllerGr();

    public void addStudyGr(StudyGr group){
        controllerGr.addGr(group);
        System.out.println("Группа успешно добавлена\n");
    }

    public void showStudentrGr(StudyGr group){
        controllerGr.getStudentrGr(group);
    }

}
