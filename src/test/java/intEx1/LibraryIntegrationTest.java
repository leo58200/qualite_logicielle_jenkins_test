package intEx1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryIntegrationTest {
    
    @Test
    public void testBorrowBook() {
        Library library = new Library();
        
        Book book = new Book("2010", "Pierre Bachelet");
        library.addBook(book);
        
        User user = new User("Michel");
        
        library.borrowBook (book, user);
        
        assertTrue(user.getBorrowedBooks().contains(book));
        assertFalse(library.isBookAvailable(book));
    }
}
