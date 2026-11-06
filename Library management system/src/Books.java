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

}
