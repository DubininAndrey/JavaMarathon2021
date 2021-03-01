package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int random) {
        this.stamina = random;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void setStamina(int stamina) {this.stamina = stamina;}

    public int getStamina() {return stamina;}

    public static int getCountPlayers() {return countPlayers;}

    public void run() {
            if (stamina == MIN_STAMINA) {
                return;
            }
            stamina --;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
    }

    public static void info() {
        StringBuilder string = new StringBuilder();
        if (countPlayers < 6) {
            int dif = 6 - countPlayers;
           if (dif <= 1) {
               string.append("Команды неполные. На поле еще есть")
                       .append(" ")
                       .append(dif)
                       .append(" ")
                       .append("свободное место")
                       .append(".");
               System.out.println(string.toString());
           }
           if (dif >= 2 && dif <= 4){
               string.append("Команды неполные. На поле еще есть")
                       .append(" ")
                       .append(dif)
                       .append(" ")
                       .append("свободных места")
                       .append(".");
               System.out.println(string.toString());
           }
           if (dif >= 5) {
               string.append("Команды неполные. На поле еще есть")
                       .append(" ")
                       .append(dif)
                       .append(" ")
                       .append("свободных мест")
                       .append(".");
               System.out.println(string.toString());
           }
        } else {
            string.append("На поле нет свободных мест.");
            System.out.println(string.toString());
        }
    }

}
