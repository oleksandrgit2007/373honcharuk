package ua.com.kisit.KR.Task4;

public class ToshibaBody implements Body {
    @Override
    public String getManufacturer() {
        return "Toshiba";
    }

    @Override
    public int getMovementSpeed() {
        return 20; // Умовна швидкість
    }
}
