package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> subscriptions;

    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user.getName());
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user.getName());
    }

    public boolean isFriend(User user) {
        return (isSubscribed(user) && user.getSubscriptions().contains(this.name));
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user,text);
    }

    @Override
    public String toString() {
        return name;
    }
}
