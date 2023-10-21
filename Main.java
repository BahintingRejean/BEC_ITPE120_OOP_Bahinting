public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", "pink");

        myCar.startEngine(); // This will call the overridden method in the Car class
        myCar.honkHorn();    // This calls the method defined in the Car class
        myCar.stopEngine();  // This will call the base class method

        // Access attributes from the base class
        System.out.println("My car is a " + myCar.make + " " + myCar.model + " in " + myCar.color + ".");
    }
}
