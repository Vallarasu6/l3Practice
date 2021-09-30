package producer.consumer;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
    ProducerConsumer pc = new ProducerConsumer();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                pc.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    t1.start();
    t2.start();
//    t1.join();
//    t2.join();
    }
}
