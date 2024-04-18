public class Person {
    private String name;
    private int age;
    static private int count;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        count+=1;
    }
    public Person(){
        this("name"+Integer.toString(count), 0);
    }

    @Override
    public String toString() {
        return name;
    }

}
