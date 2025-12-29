import java.sql.ClientInfoStatus;

public class Driver {
    String name;
    String licenseNumber;
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = name;
    }

    public void displayDriverInfo() {
        System.out.println("Name: " + name + "\nLicense Number: " + licenseNumber);
    }
}
