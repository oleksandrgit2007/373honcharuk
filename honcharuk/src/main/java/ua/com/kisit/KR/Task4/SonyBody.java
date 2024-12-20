package ua.com.kisit.KR.Task4;

public class SonyBody implements Body {
    @Override
    public String getManufacturer() {
        return "Sony";
    }

    @Override
    public int getMovementSpeed() {
        return 22; // Умовна швидкість
    }
}