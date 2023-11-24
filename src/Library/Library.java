package Library;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(String title){
        books.removeIf(book -> book.getTitle().equals(title));

    }
    public List<Book> searchBook(String query){
        List<Book> foundBooks = new ArrayList<>();
        for(Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;

    }
    public List<Book> listBooksByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public List<Book> listBooksInCategory(String category) {
        List<Book> categoryBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {
                categoryBooks.add(book);
            }
        }
        return categoryBooks;
    }
}
