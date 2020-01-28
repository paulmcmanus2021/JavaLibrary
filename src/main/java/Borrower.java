import java.util.ArrayList;

public class Borrower {

    private Book book;
    private Library library;
    private ArrayList<Book> borrowerCollection;


    public Borrower() {
        this.borrowerCollection = new ArrayList<>();
    }

    public int getBorrowerCollectionSize() {
        return this.borrowerCollection.size();
    }

    public void addBook(Book book) {
        this.borrowerCollection.add(book);
    }

    public void borrow(Book book, Library library){
        library.removeBook(book);
        this.borrowerCollection.add(book);
    }
}
