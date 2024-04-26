public class Person {
    public String name;
    public String lastname;
    public int age;

    protected Person (String n, String l, int a){
        name = n;
        lastname = l;
        age = a;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "name: " + name + "\n"+
                "lastname: " +lastname + '\n'+
                "age: " +age + "\n";
    }
}