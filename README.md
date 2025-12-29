# Vehicle Management System

## Project Overview
This is a project Vehicle management system to improve skills in OOP(Object-oriented-programming). It consists hierarchy of vehicles including cars, motorcycle, trucks, airplanes.

The system utilizes:
- **Inheritance**: To share common attributes like brand and year.
- **Abstraction**: Using an abstract `Vehicle` class to enforce contract methods (`startEngine`).
- **Composition/Aggregation**: linking `Driver` objects to `Vehicle` objects.

## Class Hierarchy
- **Vehicle (Abstract Superclass)**: Defines the core structure. Contains `protected` fields for direct subclass access.
- **Car, Motorcycle, Truck, Airplane(Subclasses)**: Extends `Vehicle`. They use `super()` to call the parent constructor and `@Override` the engine methods to provide specific implementations.
- **Driver**: Represents the operator of a vehicle. It is associated with a Vehicle via aggregation (passed in via setter).


```bash
# Compile all source files
javac src/*.java

# Run the Main program (ensure classpath includes src)
java -cp src Main
```

## Reflection
**Inheritance Design:**
Inheritance significantly simplified the design by allowing me to define `brand` and `year` once in the `Vehicle` class. Instead of rewriting these fields for every new vehicle type, the subclasses simply inherited them. This made the code cleaner and easier to maintain.

**Method Overriding:**
Overriding allowed me to treat all objects as generic `Vehicle` types in the array loop while still executing specific behaviors. For example, the `Truck` prints a message about air brakes, while the `Car` is quieter. This polymorphism is powerful for managing collections of different objects.

**Access Modifiers:**
Using `protected` was helpful for the subclasses to access parent fields directly, but it does expose those fields to other classes in the same package. Using default (package-private) for the Driver fields required me to be careful about where I placed the Main class, ensuring it stayed within the same package scope to access the data.