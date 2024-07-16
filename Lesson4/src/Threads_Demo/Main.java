package Threads_Demo;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread threadObject = new ThreadObject();
        Thread threadAltObject = new Thread(new ThreadAltObject());

        threadObject.start();
        threadAltObject.start();

        // Thread.sleep(500);
        // threadObject.interrupt();
        // threadAltObject.interrupt();
        threadAltObject.join();
        System.out.println("Main thread will continue");



    }
}
