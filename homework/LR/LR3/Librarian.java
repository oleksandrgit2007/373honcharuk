package ua.com.kisit.homework.LR.LR3;

import java.util.List;

public class Librarian {
    private long id;
    private String name;

    public Librarian() {}

    public Librarian(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void issueBook(Reader reader, Book book) {
        if (book.getCopiesAvailable() > 0) {
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
            reader.getBorrowedBooks().add(book);
            System.out.println("Book issued: " + book.getTitle() + " to " + reader.getName());
        } else {
            System.out.println("No copies available for " + book.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
