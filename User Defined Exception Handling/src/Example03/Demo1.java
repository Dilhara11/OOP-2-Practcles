package Example03;

public class Demo1 {
    static void sum(int num, int num1) throws SampleException{
        if(num1 < 10 ) throw new SampleException(num1);
        else if (num < 10) throw new SampleException(num);
        else System.out.println(num + num1);
    }

    public static void main(String[] args) {
        try {
            sum(-5, 11) ;
        } catch (SampleException e){
            System.out.println(e);
        }
    }
}
