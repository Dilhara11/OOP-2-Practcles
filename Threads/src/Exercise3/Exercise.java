package Exercise3;

public class Exercise {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("My ThreadGroup");

        Thread thread1 = new Thread(threadGroup, new MyRunnable(), "Thread1");
        Thread thread2 = new Thread(threadGroup, new MyRunnable(), "Thread2");

        thread1.start();
        thread2.start();

        System.out.println("Active Threads is Thread Group: " + threadGroup.activeCount());

        System.out.println("Thread in Thread Group :");
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for (Thread thread : threads){
            System.out.println(thread.getName());
        }
    }

    static class  MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is Running.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "has Completed.");
        }
    }
}


