package Q1;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        try {
            //code that generate exception
            int num1;
            int num2;

            Scanner input = new Scanner(System.in);

            num1 = input.nextInt();
            num2 = input.nextInt();

            int finNum = num1/num2;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException=> " + e.getMessage());
        }
    }
}
