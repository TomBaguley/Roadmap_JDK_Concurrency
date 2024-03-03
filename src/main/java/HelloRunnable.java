public class HelloRunnable implements Runnable{

//Runnable interface defines a single method, run(), that contains the code executed
//in the thread. The Runnable object is passed to the Thread constructor.
    @Override
    public void run() {
        System.out.println("Hello World, from a Runnable!");

    }
}
