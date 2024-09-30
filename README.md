# VehicleExceptionHandling

## Description
This Java project demonstrates object-oriented programming concepts such as inheritance, along with custom exception handling. The base class `Vehicle` includes a number of wheels, and the derived class `Car` adds the number of doors. A custom exception class, `NoWheelsException`, ensures that all vehicles must have at least one wheel.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `Main.java`, `Vehicle.java`, `Car.java`, and `NoWheelsException.java` files, and execute the `Main` class. The program creates several vehicles and prints their details. If a vehicle is created with zero or fewer wheels, the program throws a custom `NoWheelsException`.

### Example Output
I am a vehicle! I have 2 wheels. I am a vehicle! I have 3 wheels. I am a vehicle! I have 4 wheels. I have 2 doors. Error: A Vehicle must have wheels.

### Key Features:
- **Inheritance**: The `Car` class inherits from the `Vehicle` class, adding additional functionality.
- **Custom Exception**: The `NoWheelsException` ensures that vehicles have at least one wheel.
- **Exception Handling**: Demonstrates how to catch and handle custom exceptions in Java.

### Methods:
- **Vehicle Class**:
  - `getNumberOfWheels()`: Returns the number of wheels.
  - `setNumberOfWheels()`: Sets the number of wheels.
  - `toString()`: Returns a string representation of the vehicle.
- **Car Class**:
  - Extends `Vehicle` and adds `numberOfDoors`.
  - Overrides `toString()` to include the number of doors.
- **NoWheelsException**:
  - Custom exception thrown when a vehicle is created with zero or fewer wheels.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
