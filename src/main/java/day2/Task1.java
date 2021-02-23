package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей в доме");
        int countFloor = scanner.nextInt();
        if (countFloor <= 0) {
            System.out.println("Ошибка ввода");
        }
        if (countFloor >= 1 && countFloor <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (countFloor >= 5 && countFloor <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        if (countFloor >= 9) {
            System.out.println("Многоэтажный дом");
        }
    }
}
