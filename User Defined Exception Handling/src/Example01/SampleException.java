package Example01;

public class SampleException {
    public static void main(String[] a){
        try {
            throw new UserException(400);
        } catch (UserException e){
            System.out.println(e);
        }
    }
}

class UserException extends Exception{
    int num1;
    UserException(int num2){
        num1 = num2;
    }

    @Override
    public String toString(){
        return String.format("Status Code: %d", num1);
    }
}
