import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> libraryCollection;
    private int libraryCapacity;

    private HashMap<String,Integer> booksByGenre = new HashMap<String,Integer>();

    booksByGenre.put("Political Fiction", 1);
    booksByGenre.put("Textbook", 1);
    booksByGenre.put("Adventure Fiction", 1);
    booksByGenre.put("True Crime", 2);



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
