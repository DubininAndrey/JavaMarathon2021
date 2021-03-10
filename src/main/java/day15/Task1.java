package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathIn = "src" + separator + "main" + separator + "resources" + separator + "shoes.csv";
        String pathOut = "src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt";
        File fileIn = new File(pathIn);
        File fileOut = new File(pathOut);
        try {
            PrintWriter writer = new PrintWriter(fileOut);
            Scanner scanner = new Scanner(fileIn);
            while (scanner.hasNextLine()) {
                String[] string = scanner.nextLine().split(";");
                if (Integer.parseInt(string[2]) == 0) {
                    writer.println(string[0] + ", " + string[1] + ", " + string[2]);
                }
            }
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
