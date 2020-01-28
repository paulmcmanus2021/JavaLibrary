import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Animal Farm", "George Orwell", "Political Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Animal Farm", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Political Fiction", book.getGenre());
    }
}
