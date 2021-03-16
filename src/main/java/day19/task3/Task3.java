package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Integer, Point> taxi = new HashMap<>();
        while (scanner.hasNext()) {
            int id = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Point point = new Point(x , y);
            taxi.put(id , point);
        }
        scanner.close();
        System.out.println("Введите четыре координаты: х1 у1 х2 у2");
        Scanner scanner1 = new Scanner(System.in);
        String points = scanner1.nextLine();
        String[] points1 = points.split("\\s");
        int x1 = Integer.parseInt(points1[0]);
        int y1 = Integer.parseInt(points1[1]);
        int x2 = Integer.parseInt(points1[2]);
        int y2 = Integer.parseInt(points1[3]);
        scanner1.close();
        int count = 0;
        for (Map.Entry entry : taxi.entrySet()) {
            Point taxiPoint = (Point) entry.getValue();
            int x = taxiPoint.getX();
            int y = taxiPoint.getY();
            if (x > x1 && x < x2 && y > y1 && y < y2) {
                count++;
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Всего в квадрате: " + count + " машин такси.");

    }
}

