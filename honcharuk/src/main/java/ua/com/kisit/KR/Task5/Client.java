package ua.com.kisit.KR.Task5;

public class Client {
    private String name;
    private String passportNumber;

    public Client(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}