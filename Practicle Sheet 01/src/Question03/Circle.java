package Question03;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw circle using p = 2 * PI * R (R: Radius, PI: the ratio of " +
                "the circumference of a circle to it's diameter)");
    }
}
