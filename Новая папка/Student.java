public class Student extends Person {
    public int numberGr;
    Student(Person person, int n){
        super(person.name, person.lastname, person.age);
        numberGr = n;
    }

    Student(String n, String last, int age, int num){
        super(n, last, age);
        numberGr = num;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "expirience: "+ Integer.toString(numberGr) + "\n";
    }
    

}
