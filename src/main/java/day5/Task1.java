package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setColor("Blue");
        car1.setModel("Renault");
        car1.setYearRelease(2007);

        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Модель автомобиля: " + car1.getModel());
        System.out.println("Год выпуска автомобиля: " + car1.getYearRelease());
    }
}
