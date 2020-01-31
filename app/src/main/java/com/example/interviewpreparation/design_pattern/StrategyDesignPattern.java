package com.example.interviewpreparation.design_pattern;

import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

interface PaymentWay {
    void pay(int price);
}

class CreditCardPayment implements PaymentWay {
    private String cardNumber;
    private String cardHolderName;
    private String date;
    public CreditCardPayment(String cardNumber, String cardHolderName, String date) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.date = date;
    }

    @Override
    public void pay(int price) {
        System.out.println("Paid by credit card");
    }
}

class PaytmPayment implements PaymentWay {
    private String phoneNumber;
    private String cardHolderName;

    public PaytmPayment(String phoneNumber, String cardHolderName) {
        this.phoneNumber = phoneNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int price) {
        System.out.println("Paid by Paytm");
    }
}

class Cart {
    List<Item> items = new ArrayList<>();
    int price;

    public void addItem(Item item){
        items.add(item);
    }

    public void pay(PaymentWay paymentWay) {
        for(Item item : items) {
            price += item.getPrice();
        }
        paymentWay.pay(price);
    }
}

public class StrategyDesignPattern {
    public static void main(String[] args) {
        Item item = new Item("Shoes", 8000);
        Item item2 = new Item("Socks", 200);

        Cart cart = new Cart();
        cart.addItem(item);
        cart.addItem(item2);

        cart.pay(new CreditCardPayment("88885646616", "anand", "date"));
        cart.pay(new PaytmPayment("92013365222", "Anand"));
    }
}
