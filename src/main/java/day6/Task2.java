package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boing", 2019,15000,50000);
        airplane.info();
        airplane.setYear(2021);
        airplane.setLenght(19000);
        airplane.fillUp(300);
        airplane.fillUp(150);
        airplane.info();
    }
}
