import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryCollection;
    private int libraryCapacity;


    public Library(ArrayList<Book> libraryCollection, int libraryCapacity) {
        this.libraryCollection = libraryCollection;
        this.libraryCapacity = libraryCapacity;
    }


    public int stockCount() {
        return this.libraryCollection.size();
    }

    public void addBook(Book book) {
        if (this.stockCount() < libraryCapacity) {
            this.libraryCollection.add(book);
        }
    }

    public void removeBook(Book book) {
        this.libraryCollection.remove(book);
    }
}
