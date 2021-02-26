package day5;

public class Motorbike {
    private int yearRelease;
    private String color;
    private String model;

    public Motorbike (int yearRelease, String color,String model) {
        this.yearRelease = yearRelease;
        this.color = color;
        this.model = model;
    }

    public int getYearRelease() {return yearRelease;}

    public String getColor() {return color;}

    public String getModel() {return model;}
}
