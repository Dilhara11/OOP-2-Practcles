package Inheritance;

public class SuperCls {
    int x = 20;
    void display(){
        System.out.println("Super Class X: " + x);
    }
}

class SubCls extends SuperCls{
    int x = 80;
    void display(){
        System.out.println("Sub class X: " + x);
        super.display();
    }
}

class Main_Super{
    public static void main(String[] args) {
        SubCls subCls =new SubCls();
        subCls.display();
    }
}
