package ua.com.kisit.KR.Task4;

public class SonyElectronics implements Electronics {
    @Override
    public String getManufacturer() {
        return "Sony";
    }

    @Override
    public int getCalculationSpeed() {
        return 55; // Умовна швидкість
    }

    @Override
    public int getCalculationQuality() {
        return 92; // Умовна якість
    }
}