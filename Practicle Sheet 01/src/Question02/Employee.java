package Question02;

public class Employee extends Person{
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Hello, I am an Employee!");
    }
}
