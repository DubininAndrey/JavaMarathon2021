package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {return year;}

    public String getColor() {return color;}

    public String getModel() {return model;}

    public void info () {
        System.out.println("Это мотоцикл");
        return;
    }

    public int yearDifference (int inputYear){
        return Math.abs(inputYear - year);
    }
}
