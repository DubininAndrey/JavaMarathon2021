package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("src/main/resources/numbers19.txt");
        Scanner scanner = new Scanner(text);
        Set<Integer> numbers = new HashSet<>();
        while (scanner.hasNextLine()) {
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }
        int count = 0;
        for (Integer number : numbers) {
            if (number >= 500000000 && number <= 600000000) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
