package Q1;

public class MyDemo extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Exception Caught!");
        }
    }
}
