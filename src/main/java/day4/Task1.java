package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        int[] array = new int[n];
        int sumArray = 0;
        int countEight = 0;
        int countOne = 0;
        int countEven = 0;
        int countOdd =0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                countEight++;
            }
            if (array[i] == 1) {
                countOne++;
            }
            if (array[i] % 2 == 0) {
                countEven++;
            }
            if (array[i] % 2 != 0) {
                countOdd++;
            }
            sumArray += array[i];
        }

        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + countEight);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sumArray);



    }
}
