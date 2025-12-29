public class Main {
    public static void main(String[] args) {
        //new driver objects
        Driver driver1 = new Driver("Vitya", "ID1");
        Driver driver2 = new Driver("Andrei", "ID2");
        Driver driver3 = new Driver("Oliver", "ID203"); // oliver has 10 year experience of flying with airplane
        Car car1 = new Car("toyota", 2017, 4, "benzin", driver1);
        Car car2 = new Car("cobalt", 2013, 4, "benzin", driver1);
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", 2018, false, driver2);
        Truck truck1 = new Truck("Ford", 2007, 6, 6, driver1);
        Airplane airplane1 = new Airplane("Airbus", 2019, 100, "Business class", driver3);

        car1.setDriver(driver1);
        motorcycle1.setDriver(driver2);
        truck1.setDriver(driver1);
        airplane1.setDriver(driver3);

        Vehicle[] garage = {car1, motorcycle1, truck1, airplane1};
        System.out.println("Vehicles: \n");
        for (Vehicle v : garage) {
            v.startEngine();
            v.displayinfo();
            v.stopEngine();
        }
    }
}