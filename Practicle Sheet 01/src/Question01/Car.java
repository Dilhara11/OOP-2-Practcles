package Question01;

public class Car extends Vehicle{
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    public String toString(){
        return brand + " " + model + " " + year;
    }
}
