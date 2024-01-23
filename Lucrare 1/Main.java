import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library.");
    }

    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Book '" + book.getTitle() + "' removed from the library.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the library.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("'" + book.getTitle() + "', written by: '" + book.getAuthor() +
                        "', ISBN: " + book.getIsbn());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Cat's Eye", "Margaret Atwood", "9780385491020");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("------------------------");
        library.displayBooks();
        System.out.println("------------------------");
        library.removeBook("9780385491020");
        System.out.println("------------------------");
        library.displayBooks();
    }
}
