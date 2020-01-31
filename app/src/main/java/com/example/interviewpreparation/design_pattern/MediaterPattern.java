package com.example.interviewpreparation.design_pattern;

import java.util.ArrayList;
import java.util.List;

interface User {
    void send(String msg);

    void recieve(String msg);
}

interface Mediator {
    void addUser(User user);

    void sendToUser(User user, String msg);
}

class UserImpl implements User {
    private Mediator mediator;
    private String name;

    UserImpl(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sent msg : " + msg);
        mediator.sendToUser(this, msg);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.name + " recieved msg :" + msg);
    }
}

class MediatorImpl implements Mediator {
    List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendToUser(User user, String msg) {
        for (User u : users) {
            if (u != user) {
                u.recieve(msg);
            }
        }
    }
}

public class MediaterPattern {
    public static void main(String[] args) {
        MediatorImpl mediatorImple = new MediatorImpl();
        User user = new UserImpl(mediatorImple, "Anand");
        User user1 = new UserImpl(mediatorImple, "Rohit");
        User user2 = new UserImpl(mediatorImple, "Manish");

        mediatorImple.addUser(user);
        mediatorImple.addUser(user1);
        mediatorImple.addUser(user2);

        user.send("Hi all");
    }
}
