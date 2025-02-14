package Example03;

public class SampleException extends Exception{
    private int e;
    SampleException(int num1){
        e = num1;
    }

    @Override
    public String toString(){
        return String.format("%d is lesser than Ten", e);
    }
}
