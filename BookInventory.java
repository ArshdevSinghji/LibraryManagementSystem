import java.util.*;

public class BookInventory {
    private final ArrayList<Book> books;
    private final Map<String, Book> bookMap;

    public BookInventory() {
        this.books = new ArrayList<>();
        this.bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getIsbn(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public Book getBook(String isbn) {
        return bookMap.get(isbn);
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found: " + book);
            }
        }
    }

    public void displayAllBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + "', author='" + author + "', isbn='" + isbn + "'}";
    }
}
