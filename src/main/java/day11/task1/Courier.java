package day11.task1;

public class Courier implements Worker{
    private int salary = 0;
    private boolean isPayed = false;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.addCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else if (warehouse.getCountDeliveredOrders() == 10000) {
                salary += 50000;
                isPayed = true;
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
