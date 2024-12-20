package ua.com.kisit.KR.Task4;

public class SamsungElectronics implements Electronics {
    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public int getCalculationSpeed() {
        return 60; // Умовна швидкість
    }

    @Override
    public int getCalculationQuality() {
        return 85; // Умовна якість
    }
}