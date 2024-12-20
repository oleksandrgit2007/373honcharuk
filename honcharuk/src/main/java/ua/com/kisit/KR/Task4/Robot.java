package ua.com.kisit.KR.Task4;

public class Robot {
    private final Body body; // Залежність корпусу
    private final Electronics electronics; // Залежність електроніки

    public Robot(Body body, Electronics electronics) {
        this.body = body;
        this.electronics = electronics;
    }

    public void describe() {
        System.out.println("Робот зібраний з таких комплектуючих:");
        System.out.println("Корпус від: " + body.getManufacturer() + ", швидкість руху: " + body.getMovementSpeed());
        System.out.println("Електроніка від: " + electronics.getManufacturer() + ", швидкість розрахунків: "
                + electronics.getCalculationSpeed() + ", якість розрахунків: " + electronics.getCalculationQuality());
    }
}