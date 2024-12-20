package ua.com.kisit.KR.Task4;

public class RobotBuilder {
    public static void main(String[] args) {

        Body samsungBody = new SamsungBody();
        Electronics samsungElectronics = new SamsungElectronics();
        Robot robot1 = new Robot(samsungBody, samsungElectronics);

        Body sonyBody = new SonyBody();
        Electronics sonyElectronics = new SonyElectronics();
        Robot robot2 = new Robot(sonyBody, sonyElectronics);

        System.out.println("Робот №1:");
        robot1.describe();

        System.out.println("\nРобот №2:");
        robot2.describe();
    }
}