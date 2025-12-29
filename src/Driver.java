import java.sql.ClientInfoStatus;

public class Driver {
    String name;
    String licenseNumber;
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = name;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    //setters
    public void setName() {
        if (name != null) {
            this.name = name;
        }
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber != null) {
            this.licenseNumber = licenseNumber;
        }

    }

    public void displayDriverInfo() {
        System.out.println("Name: " + name + "\nLicense Number: " + licenseNumber);
    }


}
