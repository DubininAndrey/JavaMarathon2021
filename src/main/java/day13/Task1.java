package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Tom");
        User user3 = new User("Alex");

        user1.sendMessage(user2,"Message1 to u2");
        user1.sendMessage(user2,"Message2 to u2");

        user2.sendMessage(user1,"Message1 to u1");
        user2.sendMessage(user1,"Message2 to u1");
        user2.sendMessage(user1,"Message3 to u1");

        user3.sendMessage(user1,"Message1 to u1");
        user3.sendMessage(user1,"Message2 to u1");
        user3.sendMessage(user1,"Message3 to u1");

        user1.sendMessage(user3,"Message1 to u3");
        user1.sendMessage(user3,"Message2 to u3");
        user1.sendMessage(user3,"Message3 to u3");

        user3.sendMessage(user1,"Message4 to u1");

        MessageDatabase.showDialog(user1, user3);
    }
}
