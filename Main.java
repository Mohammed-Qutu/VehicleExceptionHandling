public class Main {
    public static void main(String[] args) {
        try {
            Vehicle[] vehicles = new Vehicle[3];
            
            vehicles[0] = new Vehicle(2);
            vehicles[1] = new Vehicle(3);
            vehicles[2] = new Car(4, 2);
            
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }

            Vehicle vehicleNoWheels = new Vehicle(0);
        } catch (NoWheelsException e) {
            System.out.println(e.getMessage());
        }
    }
}
