public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "123456"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "654321"));
        library.addBook(new Book("1984", "George Orwell", "111213"));
        library.addUser(new User("Alice", "U001"));
        library.addUser(new User("Bob", "U002"));
        library.borrowBook("U001", "123456");
        library.returnBook("U001", "123456");
        library.searchBook("Harry");
        library.displayBooks();
    }
}
