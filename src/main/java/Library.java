import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;


    public Library(ArrayList<Book> collection, int capacity) {
        this.collection = collection;
        this.capacity = capacity;
    }


    public int stockCount() {
        return this.collection.size();
    }


}
