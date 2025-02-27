package Q2;

public class PriNum extends Thread{

    private int number;

    public PriNum(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            System.out.println(number);
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Exception Caught!");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            PriNum thread = new PriNum(i);
            thread.start();
        }
    }
}
