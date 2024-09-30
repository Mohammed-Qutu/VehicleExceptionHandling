public class Vehicle {
    private int numberOfWheels;
    
    public Vehicle(int numberOfWheels) throws NoWheelsException {
        if (numberOfWheels <= 0) {
            throw new NoWheelsException();
        }
        this.numberOfWheels = numberOfWheels;
    }
    
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    
    @Override
    public String toString() {
        return "I am a vehicle! I have " + numberOfWheels + " wheels.";
    }
}
