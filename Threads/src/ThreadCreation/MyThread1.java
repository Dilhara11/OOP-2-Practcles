package ThreadCreation;

public class MyThread1 {
    //main method
    public static void main(String[] a){
        Thread t = new Thread("My first thread");

        //moving to active state
        t.start();
        String str = t.getName();
        System.out.println(str);
    }
}
