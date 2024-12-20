package ua.com.kisit.KR.Task5;

public class Administrator {
    public void processReturn(Order order, boolean isDamaged, double damageCost) {
        order.setReturned(true);
        order.getCar().setAvailable(true);
        if (isDamaged) {
            Invoice damageInvoice = new Invoice(order, damageCost, "Вартість ремонту");
            System.out.println("Рахунок за ремонт створено: \n" + damageInvoice);
        }
        System.out.println("Автомобіль успішно повернуто: " + order.getCar());
    }
}