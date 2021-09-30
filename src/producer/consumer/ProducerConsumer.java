package producer.consumer;

import java.util.ArrayList;

public class ProducerConsumer {
    ArrayList<Integer> list = new ArrayList<>();
    int capacity = 3;
    public void producer() throws InterruptedException {
        int vale=0;
        while (true){
            synchronized (this){
                while (list.size()==capacity)
                    wait();
                System.out.println("Producer produced "+vale);
                list.add(vale++);
                notify();
               Thread.sleep(1000);

            }
        }
    }
    public void consumer() throws InterruptedException {
        while (true){
            synchronized (this){
                while (list.size()==0){
                    wait();
                }
                int vale = list.remove(0);
                System.out.println("Consumer consumed "+vale);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
