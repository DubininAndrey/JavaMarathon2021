package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User user1 , User user2 , String text) {
        Message message1 = new Message(user1 , user2 , text);
        messages.add(message1);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User user1 , User user2) {
        for (Message x : messages) {
            if (x.getSender().equals(user1) && user2.equals(x.getReceiver())
                || (user2.equals(x.getSender()) && user1.equals(x.getReceiver()))) {
                System.out.println(x.getSender() + ":" + " " + x.getText());
            }
        }
    }
}
