public class Teacher extends Person{
    public int experitnce;
    Teacher(Person person){
        super(person.name, person.lastname, person.age);
        experitnce = 0;
    }

    Teacher(String n, String last, int age, int exp){
        super(n, last, age);
        experitnce = exp;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "expirience: "+ Integer.toString(experitnce) + "\n";
    }
}
