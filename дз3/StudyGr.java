import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudyGr implements  Iterable<Person>{
    private List <Person> listPerson;
    private static int count;

    public StudyGr(int n){
        listPerson = new  ArrayList<Person>(n);
        count +=1;
    }


    public List<Person> getList(){
        return listPerson;
    }
    public void setList(List<Person> persons){
        listPerson = persons;
    }
    public int getSize(){
        return listPerson.size();
    }
    public void addPerson(Person o){
        listPerson.add(o);
    }
    @Override
    public Iterator<Person> iterator() {
        return listPerson.iterator();
    }
    
}