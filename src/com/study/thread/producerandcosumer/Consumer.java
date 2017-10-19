package com.study.thread.producerandcosumer;

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;
    private String id;
    public Consumer(Drop drop,String id) {
        this.drop = drop;
        this.id = id;
    }

    public void run() {
        Random random = new Random();
        for (String message = drop.take();
             ! message.equals("DONE");
             message = drop.take()) {
            System.out.format("%s:MESSAGE RECEIVED: %s%n",id, message);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {}
        }
    }
}
