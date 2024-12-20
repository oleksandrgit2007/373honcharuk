package ua.com.kisit.KR.Task5;

public class Car {
    private String brand;
    private String model;
    private String registrationNumber;
    private boolean isAvailable;

    public Car(String brand, String model, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.isAvailable = true; // За замовчуванням доступний
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + registrationNumber + ")";
    }
}