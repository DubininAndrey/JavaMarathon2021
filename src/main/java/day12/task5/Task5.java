package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Members> members1 = new ArrayList<>();
        members1.add(new Members("Сергей Шнуров", 47));
        members1.add(new Members("Юлия Коган", 39));
        members1.add(new Members("Игорь Вдовин", 46));

        MusicBand musicBand1 = new MusicBand("Ленинград", 1997, members1);

        List<Members> members2 = new ArrayList<>();
        members2.add(new Members("Владимир Кристовский", 45));
        members2.add(new Members("Сергей Кристовскиий", 49));

        MusicBand musicBand2 = new MusicBand("Uma2Rman", 2003, members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
