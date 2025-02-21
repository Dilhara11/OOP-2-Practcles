package ThreadScheduler;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new SimpleThread("Boston");
        t1.start();
        //set thread priority to 10
        t1.setPriority(10);

        Thread t2 = new SimpleThread("New York");
        t2.start();
        //set thread priority to 5
        t2.setPriority(5);

        Thread t3 = new SimpleThread("Seoul");
        t3.start();
        //set thread priority to 1
        t3.setPriority(1);

    }
}
