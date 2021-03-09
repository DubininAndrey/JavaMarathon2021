package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("People");
        System.out.println(parseFileToObjList(file));

    }

    public static List<Human> parseFileToObjList(File file) {
        List<Human> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] age = line.split(" ");
                if (Integer.parseInt(age[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Human person = new Human (age[0] , Integer.parseInt(age[1]));
                people.add(person);
            }
            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
