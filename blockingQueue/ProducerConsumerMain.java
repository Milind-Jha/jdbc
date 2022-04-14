package blockingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(6);
//        Queue<String> queue = new LinkedList<>();
//
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

//        Producer producer = new Producer(queue);
//        Consumer consumer = new Consumer(queue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
