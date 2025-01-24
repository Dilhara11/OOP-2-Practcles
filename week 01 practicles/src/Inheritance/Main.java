package Inheritance;

class Shape{
    int a =10, b =20;
}

class Rectangle extends  Shape{
    public void rectArea(){
        System.out.println("Rectangle Area: " +(a*b));
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectArea();
    }
}
