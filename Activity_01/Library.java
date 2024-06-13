package Activity_01;

import java.util.*;

public class Library {
    public String name;
    public String registrationNo;
    public List<Book> books;

    Library(String name, String RegNo) {
        this.name = name;
        this.registrationNo = RegNo;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void getBooks() {
        for (Book book : books) {
            book.getBook();
            System.out.println("\n");
        }
    }

}



