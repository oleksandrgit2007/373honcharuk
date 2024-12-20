package ua.com.kisit.KR.Task5;

public class Order {
    private Client client;
    private Car car;
    private int rentalDays;
    private boolean isReturned;

    public Order(Client client, Car car, int rentalDays) {
        this.client = client;
        this.car = car;
        this.rentalDays = rentalDays;
        this.isReturned = false;
    }

    public Client getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}