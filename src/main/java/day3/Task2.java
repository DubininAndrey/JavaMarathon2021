package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        while (true) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            if (y != 0) {
                System.out.println(x / y);
                continue;
            } else {
                break;
            }
        }
    }
}
