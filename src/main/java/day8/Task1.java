package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str = str + i + " ";
        }
        System.out.println(str);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        long start1 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        for (int j = 0; j <= 20000; j++) {
            str2.append(j)
                    .append(" ");
        }
        System.out.println(str2);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis1);
    }
}
