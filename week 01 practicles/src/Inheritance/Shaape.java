package Inheritance;

public class Shaape {
    int a = 10, b = 20;
}

class Rectaangle extends Shaape{
    public void rectArea(){
        System.out.println("Rectangle Area: " + (a*b));
    }
}

class Triangle extends Shaape{
    public void triArea(){
        System.out.println("Triangle Area: " + (0.5*a*b));
    }
}

class Main_Shaape{
    public static void main(String[] args) {
        Rectaangle rectaangle = new Rectaangle();
        rectaangle.rectArea();
        Triangle triangle = new Triangle();
        triangle.triArea();
    }
}
