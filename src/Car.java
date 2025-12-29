public class Car extends Vehicle {
    int doors;
    public String fueltype;

    public Car(String brand, int year, int doors, String fueltype) {
        super(brand, year);
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
