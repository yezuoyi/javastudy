package com.study.thread.producerandcosumer;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop,"A"))).start();
        (new Thread(new Consumer(drop,"B"))).start();
    }
}

