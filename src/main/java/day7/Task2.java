package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int minStamina = 90;
        int maxStamina = 100;
        Random randomCount = new Random();
        int random = randomCount.nextInt(maxStamina - minStamina + 1) + minStamina;

        System.out.println(Player.getCountPlayers());
        Player.info();
        System.out.println();

        Player player1 = new Player(random);
        Player player2 = new Player(random);
        Player player3 = new Player(random);

        System.out.println(Player.getCountPlayers());
        Player.info();
        System.out.println();

        Player player4 = new Player(random);
        Player player5 = new Player(random);
        Player player6 = new Player(random);

        System.out.println(Player.getCountPlayers());
        Player.info();
        System.out.println();

        System.out.println(player4.getStamina());

            while (player4.getStamina() > 0) {
                player4.run();
            }

        System.out.println(player4.getStamina());
        System.out.println();

        System.out.println(Player.getCountPlayers());
        Player.info();
        System.out.println();

        Player player7 = new Player(random);

        System.out.println(Player.getCountPlayers());
        Player.info();
        System.out.println();

        Player player8 = new Player(random);
        Player player9 = new Player(random);

        System.out.println(Player.getCountPlayers());
        Player.info();
    }
}

