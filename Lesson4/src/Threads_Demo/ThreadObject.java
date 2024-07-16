package Threads_Demo;

public class ThreadObject extends Thread {

    @Override
    public void run() {

        System.out.println("Hello from thread object");

        for (int i = 0; i < 20; i++) {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException interruptedException) {

                System.out.println("Thread has been interrupted");
                Thread.currentThread().interrupt();
            }

            System.out.println("count from thread object - " + i);
        }

        super.run();
    }
}
