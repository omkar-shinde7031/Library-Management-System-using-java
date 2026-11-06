import java.util.ArrayList;

public class Library{
    private ArrayList<Books> books;

    public Library(){
        this.books = new ArrayList<Books>();
    }

    public void addBook(Books book){
        books.add(book);
    }
    public void displayAvailableBooks(){
        for(Books book : books){
            if(book.isAvaliable()){
                System.out.println(book.getTitle() + "by" + book.getAuthor());
            }
        }
    }

}