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
        ArrayList<Book> collection = new ArrayList<>();
        book1 = new Book("Animal Farm", "George Orwell", "Political Fiction");
        book2 = new Book("Learn Python the Hard Way", "Zed Shaw", "Textbook");
        book3 = new Book("Helter Skelter", "Vincent Bugliosi", "True Crime");
        book4 = new Book("Moby Dick", "Herman Melville", "Adventure Fiction");
        book5 = new Book("In Cold Blood", "Truman Capote", "True Crime");
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);
        library = new Library( collection, 4 );
    }

    @Test
    public void checkLibraryStock(){
        assertEquals(3, library.stockCount());
    }






}
