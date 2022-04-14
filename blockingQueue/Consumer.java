package blockingQueue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    BlockingQueue<String> blockingQueue = null;
//    Queue<String> queue = null;

    public Consumer( BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
//    public Consumer( Queue<String> queue){
//        this.queue = queue;
//    }

    @Override
    public void run() {
        while (true){
            try {
                String element = blockingQueue.take();
                System.out.println("Consumed from queue : "+element);
            }catch (InterruptedException ie){
                System.err.println("Consumer Interruption");
            }

        }
    }


//    @Override
//    public void run() {
//        while (true){
//            String element = queue.poll();
//            System.out.println("Consumed from queue : "+element);
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException ie){
//                System.err.println("Consumer Interruption");
//            }
//        }
//    }
}
