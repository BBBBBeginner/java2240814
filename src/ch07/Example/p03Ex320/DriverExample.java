package ch07.Example.p03Ex320;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        
        driver.drive(new Bus());

        Taxi taxi = new Taxi();
        driver.drive(taxi);

    }
}
