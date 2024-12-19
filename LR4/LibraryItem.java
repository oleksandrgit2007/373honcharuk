package ua.com.kisit.homework.LR.LR4;

abstract class LibraryItem {
    private long id;
    private String title;
    private String author;

    public LibraryItem(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void displayInfo();
}