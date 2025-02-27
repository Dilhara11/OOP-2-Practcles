package Q3;

public class PriNumRunn implements Runnable{
    private int number;

    public PriNumRunn(int number) {
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
        for (int i = 2; i <= 10; i += 2){
            Thread thread = new Thread(new PriNumRunn(i));
            thread.start();
        }
    }
}
