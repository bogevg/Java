public class Book <T> {
    private T id;
    private String name;
    public boolean isInLibrary;
    
    public Book(T id, String name){
        this.id = id;
        this.name = name;
        isInLibrary = true;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name: " + name +"/n"+
                "in lybrary: " + isInLibrary + "/n" +
                "id: " + id;
    }
    
}