package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Numbers");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split("\\s+");
            int sum = 0;

            if (numbersString.length != 10) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                for (String number : numbersString) {
                    sum += Integer.parseInt(number);
                }
            }
            if (sum != 0) {
                System.out.println(sum);
            }
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
