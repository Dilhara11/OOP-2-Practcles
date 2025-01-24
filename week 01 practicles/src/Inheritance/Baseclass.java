package Inheritance;

public class Baseclass {
    private int x = 30;
    protected int y = 50;

    private void m1(){
        System.out.println("Base class m1 method");
    }

    protected void m2(){
        System.out.println("Base class m2 method");
    }
}

class Derivedclass extends Baseclass{

}

class Mainclass {
    public static void main(String[] args) {
        Derivedclass d = new Derivedclass();
        //we cannot access private members due to not being available in the subclass

//        System.out.println("X = " +d.x); //in here X cannot be access

        //accessing protected members from the subclass
        d.m2();
        System.out.println("Y = " + d.y);
    }
}
