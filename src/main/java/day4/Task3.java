package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(50);
            }
        }

        int sumLine = 0;
        int sumMaxLine = 0;
        int line = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sumLine += numbers[i][j];
            }
            if (sumLine > sumMaxLine){
                sumMaxLine = sumLine;
                line = i;
            }
            sumLine = 0;
        }
        System.out.println(line);
    }
}
