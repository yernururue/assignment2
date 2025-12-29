public class Truck extends Vehicle{
    double capacity;
    int numAxles;
    public Truck(String brand, int year, double capacity, int numAxles, Driver driver) {
        super(brand, year, driver);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine of Truck is starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine of truck is stopping...");
    }
}

