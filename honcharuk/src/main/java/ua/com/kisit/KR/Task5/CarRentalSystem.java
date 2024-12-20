package ua.com.kisit.KR.Task5;

public class CarRentalSystem {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        Administrator admin = new Administrator();

        Car car1 = new Car("Toyota", "Corolla", "AB1234AT");
        Car car2 = new Car("Honda", "Civic", "KA4565AM");
        rentalService.addCar(car1);
        rentalService.addCar(car2);

        System.out.println("Список доступних автомобілів:");
        rentalService.listAvailableCars().forEach(System.out::println);


        Client client = new Client("Іван Іваненко", "AA123456");
        Order order = rentalService.rentCar(client, car1, 5);


        if (order != null) {
            admin.processReturn(order, true, 500.0);
        }
    }
}