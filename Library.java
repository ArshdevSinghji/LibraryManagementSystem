import java.util.*;

public class Library {
    private final BookInventory bookInventory;
    private final UserAccountManager userAccountManager;

    public Library() {
        this.bookInventory = new BookInventory();
        this.userAccountManager = new UserAccountManager();
    }

    public void addBook(Book book) {
        bookInventory.addBook(book);
    }

    public void addUser(User user) {
        userAccountManager.addUser(user);
    }

    public void borrowBook(String userId, String bookISBN) {
        if (userAccountManager.borrowBook(userId, bookInventory.getBook(bookISBN))) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book borrowing failed.");
        }
    }

    public void returnBook(String userId, String bookISBN) {
        if (userAccountManager.returnBook(userId, bookInventory.getBook(bookISBN))) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book return failed.");
        }
    }

    public void searchBook(String title) {
        bookInventory.searchBook(title);
    }

    public void displayBooks() {
        bookInventory.displayAllBooks();
    }
}
