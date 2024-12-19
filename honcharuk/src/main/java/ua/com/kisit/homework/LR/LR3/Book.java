package ua.com.kisit.homework.LR.LR3;

public class Book {
    private long id;
    private String title;
    private String author;
    private int copiesAvailable;

    public Book() {}

    public Book(long id, String title, String author, int copiesAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copiesAvailable=" + copiesAvailable +
                '}';
    }
}