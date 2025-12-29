public class Airplane extends Vehicle{
    private int capacity;
    private String type;

    public Airplane(String brand, int year, int capacity, String type, Driver driver) {
        super(brand, year, driver);
        this.capacity = capacity;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println("The engine of airplane is starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("The engine of airplane is stopping...");
    }
}
