package ua.com.kisit.KR.Task4;

public class ToshibaElectronics implements Electronics {
    @Override
    public String getManufacturer() {
        return "Toshiba";
    }

    @Override
    public int getCalculationSpeed() {
        return 50; // Умовна швидкість
    }

    @Override
    public int getCalculationQuality() {
        return 90; // Умовна якість
    }
}