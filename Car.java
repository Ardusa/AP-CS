/**
 * implement a class car with the following properties. A car has a certain fuel effeciency (measured in miles/gallon or liters/km - pick one)
 * and a certain amount of fuel in the gas tank. The effeciency is specified in the constructor, and the initial fuel level is 0.
 * Supply a method drive that simulates driving the car for a certain distance, reducing the amount of gasoline in the fuel tank.
 * Also supply methods getGasInTank, returning the current amount of gasoline in the fuel tank and addGas to add fuel to the tank. Sample usage:
 * car myHybrid = new Car(50); // 50 miles per gallon
 * myHybrid.addGas(20); // Tank 20 gallons
 */

public class Car {
    private double MPG; // Miles Per Gallon
    private double tank; // Miles

    public Car(double MPG) {
        this.MPG = MPG;
        tank = 0;
    }
    
    public void addGas(double gallons) {
        tank += (gallons * MPG);
    }
    
    public void drive(double miles) {
        tank -= miles;
    }

    public double getGasInTank() {
        return tank/MPG;
    }
}
