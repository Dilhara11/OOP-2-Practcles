package ThreadScheduler;

public class TestSleep1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleep1 t1 = new TestSleep1();
        TestSleep1 t2 = new TestSleep1();

        t1.start();
        System.out.println(t1.getName());
        t2.start();
        System.out.println(t2.getName());
    }
}
