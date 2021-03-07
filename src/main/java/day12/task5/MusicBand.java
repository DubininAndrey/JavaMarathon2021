package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Members> members;

    public MusicBand(String name , int year , List<Members> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<Members> getMembers() { return members; }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public static void transferMembers (MusicBand band1, MusicBand band2) {
        for (Members member : band1.getMembers()) {
            band2.getMembers().add(member);
        } band1.getMembers().clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
