package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2011, "Green", "Suzuki");

        System.out.println("Цвет мотоцикла: " + motorbike1.getColor());
        System.out.println("Модель мотоцикла: " + motorbike1.getModel());
        System.out.println("Год выпуска мотоцикла: " + motorbike1.getYearRelease());
    }
}
