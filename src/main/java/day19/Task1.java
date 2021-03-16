package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(text); //
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        int count = 0;
        while (scanner.hasNext()) {
            String x = scanner.next();
            if (wordCount.containsKey(x)) {
                count = (wordCount.get(x));
                wordCount.put(x , count + 1);
            } else {
                wordCount.put(x , 1);
            }
        }
        scanner.close();
        Map<String, Integer> sortedMap = wordCount.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey ,
                                Map.Entry::getValue ,
                                (e1 , e2) -> e1 ,
                                LinkedHashMap::new));
        int i = 0;
        for (Map.Entry x : sortedMap.entrySet()) {
            if (i < 100) {
                System.out.println(x);
                i++;
            } else {
                break;
            }
        }
        System.out.println("Чичиков - " + sortedMap.get("Чичиков")); //// Чичиков - 601

    }
}
