import java.util.*;

public class UserAccountManager {
    private final LinkedList<User> users;
    private final Map<String, User> userMap;

    public UserAccountManager() {
        this.users = new LinkedList<>();
        this.userMap = new HashMap<>();
    }

    public void addUser(User user) {
        users.add(user);
        userMap.put(user.getId(), user);
        System.out.println("User added: " + user.getName());
    }

    public boolean borrowBook(String userId, Book book) {
        User user = userMap.get(userId);
        if (user != null && book != null) {
            return user.borrowBook(book);
        }
        return false;
    }

    public boolean returnBook(String userId, Book book) {
        User user = userMap.get(userId);
        if (user != null && book != null) {
            return user.returnBook(book);
        }
        return false;
    }
}

class User {
    private final String name;
    private final String id;
    private final Stack<Book> borrowedBooks;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean borrowBook(Book book) {
        borrowedBooks.push(book);
        System.out.println(name + " borrowed " + book.getTitle());
        return true;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
            return true;
        }
        return false;
    }
}
