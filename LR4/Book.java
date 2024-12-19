package ua.com.kisit.homework.LR.LR4;

public class Book extends LibraryItem {
    private int copiesAvailable;

    public Book(long id, String title, String author, int copiesAvailable) {
        super(id, title, author);
        this.copiesAvailable = copiesAvailable;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " за " + getAuthor() + ", Copies: " + copiesAvailable);
    }
}
