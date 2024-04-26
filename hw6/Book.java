public class Book <T> extends AbstBook{ //теперь унаследован от более общего класса
    private T name;
    private String author;
    public boolean isInLibrary;
    
    public Book( T name, String author){
        this.name = name;
        this.author = author;
        isInLibrary = true;
    }

    @Override
    public String toString() {
        return "name: " + name +"/n"+
                "in lybrary: " + isInLibrary + "/n";
    }

    
    
}