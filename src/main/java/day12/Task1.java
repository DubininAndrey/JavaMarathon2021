package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Lada");
        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Seat");
        cars.add("Skoda");

        System.out.println(cars);

        cars.add(2, "Mercedes");
        cars.remove(0);

        System.out.println(cars);
    }
}
