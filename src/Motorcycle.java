public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar, Driver driver) {
        super(brand, year, driver);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine of motorcycle is starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine of motorcycle is stopping...");
    }
}
