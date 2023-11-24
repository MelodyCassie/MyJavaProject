package Library;
import java. util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {
    private Library library;
    @BeforeEach
    public void setUp(){
       Library library = new Library();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction");
        Book book2 = new Book("To Kill a MockingBird", "Harper Lee", "Fiction");
        Book book3 = new Book("1984", "George Orwell","Dystopian");
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


    }
    @Test
    public void testListBooksByAuthor(){
        List <Book> booksByLee = library.listBooksByAuthor("Harper Lee");
        assertEquals(1,booksByLee.size());
        assertEquals("To Kill a MockingBird",booksByLee.get(0).getTitle());
    }
    @Test
    public void testSearchBook(){
        List <Book> searchResult = library.searchBook("Catcher");
        assertEquals(1,searchResult.size());
        assertEquals("The Catcher in the Rye",searchResult.get(0).getTitle());
    }
    @Test
    public void testRemoveBook(){
        library.removeBook("The Hobbit");
        List <Book> fantasyBooks = library.listBooksInCategory("Fantasy");
        assertTrue(fantasyBooks.isEmpty());
    }

    @Test
    public void testFictionBookCategory(){

    }
}