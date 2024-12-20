package ua.com.kisit.KR.Task5;
import java.util.List;
import java.util.ArrayList;

public class RentalService {
    private List<Car> cars;
    private List<Order> orders;

    public RentalService() {
        this.cars = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> listAvailableCars() {
        return cars.stream().filter(Car::isAvailable).toList();
    }

    public Order rentCar(Client client, Car car, int rentalDays) {
        if (car.isAvailable()) {
            car.setAvailable(false);
            Order order = new Order(client, car, rentalDays);
            orders.add(order);
            System.out.println("Автомобіль успішно повернуто: " + car + " клієнтом " + client.getName());
            return order;
        } else {
            System.out.println("Автомобіл недоступний: " + car);
            return null;
        }
    }
}