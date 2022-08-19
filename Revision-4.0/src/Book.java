import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private int isbn;
    private String bookName;
    private String author;

    public Book(){
    }

    public Book(int isbn, String bookName, String author) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library{
    List<Book> bookList = new ArrayList<>();

    void addBook(Book book){
        bookList.add(book);
        System.out.println("Book added successfully");
    }
    boolean isEmpty(){
        if(bookList.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    List<Book> viewAllBooks(){
        System.out.println(bookList);
        return null;
    }
    List<Book> viewBooksByAuthor(String author){

        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getAuthor().contains(author)){
                System.out.println(bookList.get(i).getBookName());
            }else{
                System.out.println("None of the book published by author "+author);
            }
        }

        return null;
    }
    int countNoOfBooks(String bookName){
        int count = 0;
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getBookName().contains(bookName)){
                count++;
            }
        }
        return count;
    }
}
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library li = new Library();

        System.out.println("1.Add book");
        System.out.println("2.Display all book details");
        System.out.println("3.Search book by author");
        System.out.println("4.count number of books-by book name");
        System.out.println("5.Exit");

        System.out.println("Enter your choice:");
        int x = sc.nextInt();
        if(x == 1){
            System.out.println("Enter isbn no:");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the book name:");
            String name = sc.nextLine();
            System.out.println("Enter the author name:");
            String author = sc.nextLine();

            li.addBook(new Book(num,name,author));
        }else if(x == 2){
            li.viewAllBooks();
        }else if(x == 3){
            sc.nextLine();
            System.out.println("Enter author name:");
            String aname = sc.nextLine();
            li.viewBooksByAuthor(aname);
        }else if(x == 4){
            System.out.println("Enter book name:");
            String bname = sc.nextLine();
            li.countNoOfBooks(bname);
        }else if(x == 5){
            System.out.println("Thank you");
        }
    }
}
