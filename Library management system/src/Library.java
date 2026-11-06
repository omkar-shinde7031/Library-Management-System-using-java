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
    public void   borrowBook(String title,String author){
        for(Books book : books){
            if(book.getTitle().equalsIgnoreCase(title)&& book.getAuthor().equalsIgnoreCase(author)&& book.isAvaliable()){
                book.borrowBook();
                System.out.println("you have successfully borrowed'" + title + "' by"+author +".");
            }else{
                System.out.println("soory, '" + title + "'by" + author + "is already borrowed.");
            }
            return;
        }
        System.out.println("soory, the book is not avalable!");
    }
    

}