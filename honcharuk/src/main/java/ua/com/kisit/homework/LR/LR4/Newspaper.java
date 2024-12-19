package ua.com.kisit.homework.LR.LR4;

public class Newspaper extends LibraryItem {
    private String publicationDate;

    public Newspaper(long id, String title, String author, String publicationDate) {
        super(id, title, author);
        this.publicationDate = publicationDate;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Newspaper: " + getTitle() + " by " + getAuthor() + ", Date: " + publicationDate);
    }
}