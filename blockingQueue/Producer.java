package blockingQueue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

import static java.lang.Thread.sleep;

public class Producer implements Runnable {

    BlockingQueue<String> blockingQueue = null;

//    Queue<String> queue = null;

    public Producer(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {
        while (true){
            long timeMillis = System.currentTimeMillis();
            try {
                blockingQueue.put(""+timeMillis);
                System.out.println(timeMillis+" produced.");
            }catch (InterruptedException interruptedException){
                System.err.println("Producer Interrupted");
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.err.println("Producer interruption");
            }
        }
    }


//    public Producer(Queue<String> queue){
//        this.queue=queue;
//    }

//    @Override
//    public void run() {
//        while (true){
//            long timeMillis = System.currentTimeMillis();
//
//                queue.add(""+timeMillis);
//                System.out.println(timeMillis+" produced.");
//
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException ie){
//                System.err.println("Producer interruption");
//            }
//       }
//    }
}
