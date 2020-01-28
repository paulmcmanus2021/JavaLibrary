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
        libraryCollection.add(book4);
        libraryCollection.add(book5);
        library = new Library( libraryCollection, 5 );

        // starts borrowerCollection empty and assigns to borrower
        ArrayList<Book> borrowerCollection = new ArrayList<>();
        borrower = new Borrower();
    }

    @Test
    public void borrowerStartsWith0Books(){
        assertEquals(0, borrower.getBorrowerCollectionSize());
    }

    @Test
    public void libraryStartsWith5Books(){
        assertEquals(5, library.stockCount());
    }

    @Test //remove a book from libraryCollection add one to borrowerCollection
    public void borrowBook(){
        library.removeBook(book1); // remove book1 from library
        borrower.addBook(book1); //add book1 to borrower
        assertEquals(1, borrower.getBorrowerCollectionSize());
        assertEquals(4, library.stockCount());
    }

    @Test
    public void testNewMethodToBorrow(){
        borrower.borrow(book2, library);
        assertEquals(1, borrower.getBorrowerCollectionSize());
        assertEquals(4, library.stockCount());
    }

}
