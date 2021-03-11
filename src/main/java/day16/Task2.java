package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        File file1 = new File("file1.txt");
        try {
            PrintWriter writer1 = new PrintWriter("file1.txt");
            for (int i = 0; i < 1000; i++) {
                writer1.println(random.nextInt(100));
            }
            writer1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        try {
            Scanner scanner = new Scanner(file1);
            File file2 = new File("file2.txt");
            PrintWriter writer2 = new PrintWriter(file2);
            double sum = 0.0;
            int repeat = 0;
            while (scanner.hasNextLine()) {
                sum += Double.parseDouble(scanner.nextLine());
                repeat++;
                if (repeat == 20) {
                    writer2.println(sum / repeat);
                    sum = 0.0;
                    repeat = 0;
                }
            }
            writer2.close();
            scanner.close();
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double result = 0.0;
            while (scanner.hasNextLine()) {
                result += Double.parseDouble(scanner.nextLine());
            }
            System.out.println((int) result);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
