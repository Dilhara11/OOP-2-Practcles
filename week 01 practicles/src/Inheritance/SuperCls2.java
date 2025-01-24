package Inheritance;

public class SuperCls2 {
    public SuperCls2(){
        System.out.println("In Super Constructor!");
    }
}

class SubCls2 extends SuperCls2{
    public SubCls2() {
        super();
        System.out.println("In Sub Constructor!");
    }
}

class Main_Super_Constructor{
    public static void main(String[] args) {
        SuperCls2 superCls2 = new SuperCls2();
        SubCls2 subCls2 = new SubCls2();
    }
}
