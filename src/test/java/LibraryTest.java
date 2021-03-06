import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        ArrayList<Book> libraryCollection = new ArrayList<>();
        book1 = new Book("Animal Farm", "George Orwell", "Political Fiction");
        book2 = new Book("Learn Python the Hard Way", "Zed Shaw", "Textbook");
        book3 = new Book("Helter Skelter", "Vincent Bugliosi", "True Crime");
        book4 = new Book("Moby Dick", "Herman Melville", "Adventure Fiction");
        book5 = new Book("In Cold Blood", "Truman Capote", "True Crime");
        libraryCollection.add(book1);
        libraryCollection.add(book2);
        libraryCollection.add(book3);
        library = new Library( libraryCollection, 4 );
    }

    @Test
    public void checkLibraryStock(){
        assertEquals(3, library.stockCount());
    }

    @Test
    public void addBookToStock(){
        library.addBook(book5);
        assertEquals(4,library.stockCount());
    }

    @Test
    public void addBookToStockAtCapacity(){
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4,library.stockCount());
    }




}
