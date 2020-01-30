package com.example.interviewpreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Consumer implements Runnable {
    private List<Integer> data;
    private String threadName;
    private int duration;
    int count = 0;

    Consumer(List<Integer> data, String threadName, int duration) {
        this.data = data;
        this.threadName = threadName;
        this.duration = duration;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                if (data.size() == 0) {
                    try {
                        System.out.println("Waiting on" + threadName + "thread.");
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (count == 2) {
                        System.out.println("Waiting on" + threadName + "thread. Due to count "+count);
                        try {
                            data.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        count = 0;
                    }
                    try {
                        Thread.sleep(duration);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (data.size() > 0) {
                        int d = data.remove(0);
                        System.out.println(d + " consumed on " + threadName);
                    }
                    count++;
                    data.notify();
                }
            }
        }
    }
}

class Producer implements Runnable {
    private List<Integer> data;
    private Random random = new Random();

    Producer(List<Integer> data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                if (data.size() == 5) {
                    try {
                        System.out.println("Waiting on producer thread.");
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int d = random.nextInt(100);
                    data.add(d);
                    System.out.println(d + " produced");
                    data.notify();
                }
            }
        }
    }
}

public class WaitNotifyWithMultithreading {
    public static void main(String[] args) {
        System.out.println("WaitNotifyTest");

        List<Integer> data = new ArrayList<>();
        Thread tConsumer1 = new Thread(new Consumer(data, "Consumer 1", 2000));
        Thread tConsumer2 = new Thread(new Consumer(data, "Consumer 2", 2000));
        Thread tProducer = new Thread(new Producer(data));

        tProducer.start();
        tConsumer1.start();
        tConsumer2.start();
    }
}
