package Multithreading.ThreadCreation;

import java.util.Random;

public class ColorRunnable implements Runnable {

    @Override
    public void run() {

        String[] colours = {
            "white", "blue", "black", "green", "red", "yellow"
        };

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);
            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red colour found. Thread stopped.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread(new ColorRunnable());
        t.start();
    }
}