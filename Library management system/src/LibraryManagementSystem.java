import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Books("vertiy","colleen Hoovr"));
        library.addBook(new Books("the secret","Rohan Byrne"));
        library.addBook(new Books("grit","angela dunkark"));

        while(true){
            System.out.println("\nAvaliable Book: ");
            library.displayAvailableBooks();

            System.out.println("\nDo you want to borrow or return a book?");
            System.out.println("they 'borro' to borrow a book 'return' to return a book, or 'exit' to quit");
            String action = scanner.nextLine().toLowerCase();

            if(action.equalsIgnoreCase("Borrow")){
                System.out.print("Enter the title of the book you want to borrow: ");
                String borrowTitle = scanner.nextLine();
                System.out.print("enter the author of the book you want to boeeow: ");
                String borrowAuthor = scanner.nextLine();
                library.borrowBook(borrowTitle, borrowAuthor);
            }
        }
    }
    }

