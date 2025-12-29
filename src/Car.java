public class Car extends Vehicle {
    private int doors;
    private String fueltype;

    public Car(String brand, int year, int doors, String fueltype, Driver driver) {
        super(brand, year, driver);
        this.doors = doors;
        this.fueltype = fueltype;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine of car is starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine of car is stopping ...");
    }
}
