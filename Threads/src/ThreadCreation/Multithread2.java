package ThreadCreation;

public class Multithread2 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDeom object = new MultithreadingDeom();
            object.start();
        }
    }
}
