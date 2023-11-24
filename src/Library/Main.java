package Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction");
        Book book2 = new Book("To Kill a MockingBird", "Harper Lee", "Fiction");
        Book book3 = new Book("1984", "George Orwell","Dystopian");
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Books by George Orwell:");
        System.out.println(library.listBooksByAuthor("George Orwell"));

        System.out.println("\n Search results for 'Catcher':");
        System.out.println(library.searchBook("Catcher"));

        System.out.println("\nRemoving 'The Hobbit'...");
        library.removeBook("The Hobbit");

        System.out.println("\nBooks in the Fiction category:");
        System.out.println(library.listBooksInCategory("Fiction"));

    }
}
