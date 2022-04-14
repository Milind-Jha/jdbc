package deadlock;

public class DeadLockMain {
    public static void main(String[] args) {
        String name1 = "Milind";
        String name2 = "Dilip";
        DeadLockThread1 deadLockThread1 = new DeadLockThread1(name1,name2);
        DeadLockThread2 deadLockThread2 = new DeadLockThread2(name1,name2);
        deadLockThread2.start();
        deadLockThread1.start();

    }
}
