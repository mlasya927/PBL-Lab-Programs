package Multithreading.miniproject.HareAndTortoiseRace;

class RaceThread extends Thread {

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            System.out.println(getName() + " : " + i + " meters");

            // Hare sleeps after running 60 meters
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println(getName() + " finished the race!");
    }
}

public class HareAndTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}