package deadlock;

public class DeadLockThread2 extends Thread{
    String s1;
    String s2;
    public DeadLockThread2(String s1, String s2){
        this.s1=s1;
        this.s2=s2;
    }
    @Override
    public void run() {
        int i=0;
        while (true){
            synchronized (s2){
                Thread.currentThread().setName("deadlockthread 2");
                i++;
                System.out.println(Thread.currentThread().getName() + " locked "+ s2 +" "+i);
//                try {
//                    Thread.sleep(1000);
//                }catch (InterruptedException ie){
//                    ie.printStackTrace();
//                }
                synchronized (s1){//Unreachable in case of a deadlock
                    System.out.println("Inner synchronized block entered");
                    System.out.println(Thread.currentThread().getName() + " locked "+s1);
                }
            }
        }
    }
}
