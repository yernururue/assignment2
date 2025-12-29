public class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
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
