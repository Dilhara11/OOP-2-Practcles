package ThreadGorups;

public class SimpleThread extends Thread{
    public SimpleThread(String str) {
        super(str);
    }

    public SimpleThread(ThreadGroup group, String str) {
        super(group, str);
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(i + " " + getName());
            try {
                sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Done! " + getName());
    }
}
