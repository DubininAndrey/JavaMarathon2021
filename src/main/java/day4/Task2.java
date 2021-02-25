package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random random = new Random();

        int countZero = 0;
        int sumZero = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000);
        }

        int maxValue = numbers[0];
        int minValue = numbers[0];

        for (int number: numbers){
            if (maxValue < number) {
                maxValue = number;
            }
            if (minValue > number) {
                minValue = number;
            }
            if (number % 10 == 0) {
                countZero++;
                sumZero += number;
            }
        }

        System.out.println("Наибольший элемент массива: " + maxValue);
        System.out.println("Наименьший элемент массива: " + minValue);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);
    }
}
