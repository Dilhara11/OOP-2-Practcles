package ThreadCreation;

public class MultithreadingDeom extends Thread{
    @Override
    public void run(){
        try {
            //display the thread that is running
            System.out.println(
                    "Thread" + Thread.currentThread().getId()
                            + "is Running"
            );
        } catch (Exception e) {
            System.out.println("exception is caught");
        }
    }
}
