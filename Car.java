public class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(int numberOfWheels, int numberOfDoors) throws NoWheelsException {
        super(numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public String toString() {
        return super.toString() + " I have " + numberOfDoors + " doors.";
    }
}
