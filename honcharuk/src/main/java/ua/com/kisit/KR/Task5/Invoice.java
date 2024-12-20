package ua.com.kisit.KR.Task5;

public class Invoice {
    private Order order;
    private double amount;
    private String description;

    public Invoice(Order order, double amount, String description) {
        this.order = order;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Рахунок для замовлення: " + order.getCar() + "\nСума: $" + amount + "\nОпис: " + description;
    }
}