public class Books {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Books(String title,String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println("Book is successfully borrowed: " + title);
        }else{
            System.out.println("soory, this book is already borrowed");
        }
    }

    public void returnBook(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("you've successfully returned the book: " + title);
        }else{
            System.out.println("this book is wasn't borroowed");
        }
    }

    public boolean isAvaliable(){
        return !isBorrowed;
    }

}
