package Q3;

public class Laptop extends ElectroniicDevice implements Rechargable{
    @Override
    public void turnOn(){
        System.out.println("Laptop Turned ON!");
    }

    @Override
    public void turnOff(){
        System.out.println("Laptop Turned OFF!");
    }

    @Override
    public void recharge(){
        System.out.println("Laptop is Recharging!");
    }

}
