package Inheritance;

public class SuperClass {
    int x = 20;
}

class SubClass extends SuperClass{
    int x = 80;
    void display(){
        System.out.println("SuperClass: " + super.x); // print super class
        System.out.println("SubClass: " + x); // print sub class
    }
}
