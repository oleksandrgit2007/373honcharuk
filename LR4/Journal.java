package ua.com.kisit.homework.LR.LR4;

public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(long id, String title, String author, int issueNumber) {
        super(id, title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Journal: " + getTitle() + " by " + getAuthor() + ", Issue: " + issueNumber);
    }
}

