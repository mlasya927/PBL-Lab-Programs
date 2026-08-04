package Multithreading.ThreadControlAndPriorities;

class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }

        System.out.println(getName() + " completed.");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("MAX Thread");
        PriorityThread t2 = new PriorityThread("MIN Thread");
        PriorityThread t3 = new PriorityThread("NORM Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}