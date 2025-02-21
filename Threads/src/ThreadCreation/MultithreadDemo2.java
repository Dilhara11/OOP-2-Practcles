package ThreadCreation;

public class MultithreadDemo2 implements Runnable{
    @Override
    public void run(){
        try{
            try {
                //display the thread that is running
                System.out.println(
                        "Thread" + Thread.currentThread().getId()
                                + "is Running"
                );
            } catch (Exception e) {
                System.out.println("exception is caught");
            }
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
