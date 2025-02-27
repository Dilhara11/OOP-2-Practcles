package Q4;

public class LetterPrinting {
    public static void main(String[] args) {
        FirstLetterThread thread1 = new FirstLetterThread();
        Thread thread2 = new Thread(new SecondLetterThread());

        thread1.start();
        thread2.start();
    }
}
