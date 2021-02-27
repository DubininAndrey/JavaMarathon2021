package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setYear(2017);
        System.out.println(car1.yearDifference(1998));

        Motorbike motorbike1 = new Motorbike("BMW","red", 2000);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(1980));
    }
}
