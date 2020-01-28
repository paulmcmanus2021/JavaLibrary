import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowerCollection;

    public Borrower(String name, ArrayList<Book> borrowerCollection) {
        this.name = name;
        this.borrowerCollection = borrowerCollection;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowerCollection() {
        return borrowerCollection;
    }

    public int getBorrowerCollectionSize() {
        return this.borrowerCollection.size();
    }


}
