import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;


    @Before
    public void before(){
        // fills libraryCollection with 5 books and assigns to library.
        ArrayList<Book> libraryCollection = new ArrayList<>();
        libraryCollection.add(book1);
        libraryCollection.add(book2);
        libraryCollection.add(book3);
        library = new Library( libraryCollection, 5 );

        // starts borrowerCollection empty and assigns to borrower
        ArrayList<Book> borrowerCollection = new ArrayList<>();
        borrower = new Borrower("Paul", borrowerCollection);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Paul", borrower.getName());
    }


}
