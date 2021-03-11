package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Numbers");
        printResult(file);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split("\\s+");
            double sum = 0.0;

            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }

            double result = sum / numbers.length;

            System.out.println(result + " --> " + new DecimalFormat("#.###").format(result));

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }
}

