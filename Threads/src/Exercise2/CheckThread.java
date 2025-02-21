package Exercise2;

public class CheckThread {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());

        System.out.println("Thread is Alive: " + t.isAlive());
        t.start();
        System.out.println("Thread is Alive: " + t.isAlive());
    }
}

class MyThread implements Runnable{
    @Override
    public void run(){
        try {
            System.out.println("Thread is running.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
