package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Scooter", 1993);
        MusicBand musicBand2 = new MusicBand("Muse", 1994);
        MusicBand musicBand3 = new MusicBand("Coldplay", 1996);
        MusicBand musicBand4 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand musicBand5 = new MusicBand("U2", 1976);
        MusicBand musicBand6 = new MusicBand("Vampire Weekend", 2006);
        MusicBand musicBand7 = new MusicBand("MGMT", 2005);
        MusicBand musicBand8 = new MusicBand("My Chemical Romance", 2001);
        MusicBand musicBand9 = new MusicBand("TV on the Radio", 2002);
        MusicBand musicBand10 = new MusicBand("Arcade Fire", 2003);
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(musicBand1, musicBand2, musicBand3, musicBand4, musicBand5,
                musicBand6, musicBand7, musicBand8, musicBand9, musicBand10));

        Collections.shuffle(bands);

        List<MusicBand> bandsAfter2000 = new ArrayList<>(groupsAfter2000(bands));
        System.out.println(bands);
        System.out.println(bandsAfter2000);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new ArrayList();
        for (MusicBand x : bands) {
            if (x.getYear() >= 2000) {
                after2000.add(x);
            }
        }
        return after2000;
    }
}





