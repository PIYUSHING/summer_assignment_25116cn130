// Library management system
import java.util.Scanner;
import java.util.ArrayList;
class Book{
    private String name;
    private int bookId;
    public static String librabry = "KitabShala";
    public String status;

    public Book(String name, int bookId, String status){
        this.name = name;
        this.bookId = bookId;
        this.status = status;
    }
    // getter
    public String getBook(){
        return name;
    }
    public int getBookId(){
        return bookId;
    }
    public String getStatus(){
        return status;
    }

    //setter
    public void setStatus(String status){
        this.status = status;
    }
    //display
    public void display(){
        System.out.println("-------------------");
        System.out.println("Book Id :- " + bookId );
        System.out.println("Book Name :- " + name);
        System.out.println("Status :- " + status);
        System.out.println("-------------------");
    }
}

class LibraryManagement{
    ArrayList<Book> book = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void addBook(Book bk){
        if(bk != null){
            book.add(bk);
            System.out.println("Book Successfully Added");
        }
        else{
            System.out.println("invalid input");
        }
    }
    
    public Book searchBook(int bookId){
        for(Book bk : book){
            if(bk.getBookId() == bookId){
                System.out.println("Book Found");
                return bk;
            }
        }
        return null;
    }

    public void issueBook(int bookId){
        Book bk = searchBook(bookId);
        bk.setStatus("Issued");
        bk.display();
    }

    public void returnBook(int bookId){
        Book bk = searchBook(bookId);
        bk.setStatus("Returned");
        bk.display();
    }

    public void displayAllBooks(){
        System.out.println("===== KITABSHALA =====");
        if(book.isEmpty()){
            System.out.println("Library Empty");
        }
        else{
            for(Book bk : book){
                bk.display();
            }
        }
    }
}

public class program_109{
    public static void main(String[] args){
        LibraryManagement lm = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("Welcome to KITABSHALA");
            System.out.println("1. Add new BOOKS");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. return Book");
            System.out.println("5. Display Library Collection");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Book Id :- ");
                    int bookId = scanner.nextInt();
                    System.out.print("Book Name :- ");
                    String name = scanner.next();
                    lm.addBook(new Book( name , bookId, "Null"));
                    break;
                case 2:
                    System.out.print("Book Id :- ");
                    int id = scanner.nextInt();
                    Book bk = lm.searchBook(id);
                    bk.display();
                    break;
                case 3:
                    System.out.print("Book Id :- ");
                    int idd = scanner.nextInt();
                    Book bkk = lm.searchBook(idd);
                    bkk.setStatus("issued");
                    System.out.println("Book issued successfully");
                    break;
                case 4:
                    System.out.print("Book Id :- ");
                    int iddd = scanner.nextInt();
                    Book bkkk = lm.searchBook(iddd);
                    bkkk.setStatus("returned");
                    System.out.println("book returned successfully");
                    break;
                case 5:
                    System.out.println("KITABSHALA");
                    lm.displayAllBooks();
                    break;
                case 6:
                    running = false;
                    System.out.println("----- Thankyou -----");
                    break;
                default :
                    System.out.println("Invalid Entry");
                    break;
            }
        }
        scanner.close();
    }
}