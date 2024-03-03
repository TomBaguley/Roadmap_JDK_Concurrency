public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();

        HelloThread helloThread = new HelloThread();
        helloThread.start();

//Both of these methods dxo the same thing. Using Runnable and injecting it in to a thread
//is more general, as Runnable can extend other classes. 2nd approach is similar but limits functionality of task class.

    }


}
