package Q4;

public class SecondLetterThread implements Runnable{
    @Override
    public void run() {
        for (char c = 'F'; c <= 'J'; c++){
            System.out.println(c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
