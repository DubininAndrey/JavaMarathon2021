package day11.task1;

public class Picker implements Worker{
    private int salary = 0;
    private boolean isPayed = false;
    public int countPicker = 0;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        countPicker++;
    }

    public int getCountPicker() {
        return countPicker;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            }else if (warehouse.getCountPickedOrders() == 10000) {
                salary += 70000;
                isPayed = true;
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
