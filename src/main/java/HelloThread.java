public class HelloThread extends Thread{
    // Thread implements Runnable, but the run() method does nothing.
    // As we are extended Thread here, we can add out own implementation to the subclass.

    public void run() {
        System.out.println("Hello World, from a Thread!");
    }
}
