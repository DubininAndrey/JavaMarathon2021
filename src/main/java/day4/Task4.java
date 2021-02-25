package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();

        int sum = 0;
        int sumMax = 0;
        int index = 0;

        for (int i =0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }

        for (int i = 0; i < array.length - 2; i++) {
            sum += array[i] + array[i + 1] + array[i + 2];
            if (sum > sumMax){
                sumMax = sum;
                index = i;
            }
            sum = 0;
        }

        System.out.println(sumMax + "\r\n" + index);

    }
}
