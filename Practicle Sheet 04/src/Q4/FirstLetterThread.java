package Q4;

public class FirstLetterThread extends Thread{
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++){
            System.out.println(c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
