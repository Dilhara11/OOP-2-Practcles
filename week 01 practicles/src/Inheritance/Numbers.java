package Inheritance;

public class Numbers {
    int a = 10, b = 20;
}

class add2 extends Numbers{
    int c = 30;
    public void sum2(){
        System.out.println("sum of 2 nos: " + (a + b));
    }
}

class add3 extends add2{
    public void sum3(){
        System.out.println("sum of 3 nos: " + (a + b + c));
    }
}

class Numbers_Main{
    public static void main(String[] args) {
        add3 add3 = new add3();
        add3.sum2();
        add3.sum3();
    }
}
