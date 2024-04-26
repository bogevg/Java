public class BookService { //для работы с книгой выделена отдельная сущность
    public void read(){
        System.out.println("Читаем книгу");
    }

    public void makeBookmark(Book book, int pages){
        book.pagesOfBookmark = pages;
    }
}
