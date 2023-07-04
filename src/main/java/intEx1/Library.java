package intEx1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(Book book) {
        return books.contains(book);
    }

    public void borrowBook(Book book, User user) {
        if(isBookAvailable(book)) {
            books.remove(book);
            user.getBorrowedBooks().add(book);
        } else {
            System.out.println("Le livre demandé n'est pas disponible.");
        }
    }
}

