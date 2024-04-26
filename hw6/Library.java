import java.util.ArrayList;
import java.util.List;

public class Library { 

    private List <Book> books ;
    
    Library(){
        books = new ArrayList<>();
    }

    public <T> void addBook(Book<T> book){
        if (book.isInLibrary){
            books.add(book);
        }
        else {
            book.isInLibrary = true;
        }
    }

    public <T> void getBook(Book<T> book){
        book.isInLibrary = false;
    }

    public void showBooks(){
        for (Book book : books) {
            if (!(book.isInLibrary)){
                System.out.println(book);
            }
        }
    }
}
