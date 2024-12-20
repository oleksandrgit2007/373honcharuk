package ua.com.kisit.KR.Task4;

public class SamsungBody implements Body {
    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public int getMovementSpeed() {
        return 25; // Умовна швидкість
    }
}