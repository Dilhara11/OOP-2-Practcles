package Q2;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck is Flying.");
    }

    @Override
    public void swim(){
        System.out.println("Duck is Swimming.");
    }
}
