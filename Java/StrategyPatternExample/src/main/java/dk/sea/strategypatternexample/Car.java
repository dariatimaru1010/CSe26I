package dk.sea.strategypatternexample;

public class Car extends Vehicle{
    private int price;
    private String name;
    private String vin;

    public Car(String name, int price, String vin) {
        this.vin = vin;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " €" + price + "   " + vin;
    }

    public int getPrice() {
        return price;
    }

    public String getVin(){
        return vin;
    }

    public String getName() {
        return name;
    }

    @Override
    public void driveForward() {
        // driving as a car, weeee!
    }
}
