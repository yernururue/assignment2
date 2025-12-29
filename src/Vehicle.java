public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;
    //getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    //setters
    public void setBrand() {
        if (brand != null) {
            this.brand = brand;
        }
    }

    public void setYear(int year) {
        if (year >= 1885 && year <= 2025) {
            this.year = year;
        }
    }


    public Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }
    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayinfo() {
        System.out.println("Brand: " + brand + "\nYear: " + year);
    }
}
