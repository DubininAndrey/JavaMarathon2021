package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Сергей Шнуров");
        members1.add("Юлия Коган");
        members1.add("Игорь Вдовин");

        MusicBand musicBand1 = new MusicBand("Ленинград", 1997, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Владимир Кристовский");
        members2.add("Сергей Кристовскиий");

        MusicBand musicBand2 = new MusicBand("Uma2Rman", 2003, members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
