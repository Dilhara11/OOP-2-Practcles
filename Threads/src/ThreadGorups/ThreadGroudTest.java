package ThreadGorups;

public class ThreadGroudTest {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("My Group");

        SimpleThread t1 = new SimpleThread(group, "Boston");
        SimpleThread t2 = new SimpleThread(group, "New York");
        SimpleThread t3 = new SimpleThread(group, "Seoul");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Number of active threads in this thread group = " +
                group.activeCount());

        Thread[] tarray = new Thread[10];
        int actualSize  = group.enumerate(tarray);
        for (int i = 0; i < actualSize; i++){
            System.out.println("Thread " + tarray[i].getName() + "In thread group " + group.getName());
        }
    }
}
