import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flow> flows = new ArrayList<Flow>(3);
        System.out.println("bitch");
        flows.add(new Flow(0));
        flows.add(new Flow(0));
        flows.add(new Flow(0));
        flows.get(0).getListGr().add(new StudyGr(10));
        for (int i = 0; i < 1; i++) {
            flows.get(0).getListGr().get(0).addPerson(new Person()); // Добавляем 10 объектов Person в группу
        }
        flows.get(0).getListGr().add(new StudyGr(10));
        flows.get(1).getListGr().add(new StudyGr(11));
        flows.get(2).getListGr().add(new StudyGr(11));
        flows.get(2).getListGr().add(new StudyGr(12));
        flows.get(2).getListGr().add(new StudyGr(12));

        for (Person person : flows.get(0).getListGr().get(0)) {
                System.out.println(person);
            }
        }
}
    
