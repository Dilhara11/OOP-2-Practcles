package ThreadCreation;

public class MyThread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Now the thread is running...");
    }

    public static void main(String[] args) {
        Runnable r1 = new MyThread2();

        Thread th1 = new Thread("My New Thread");

        th1.start();

        String str = th1.getName();
        System.out.println(str);
    }
}
