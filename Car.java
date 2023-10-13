public class Car {
    private double mpg;
    private double gallons;

    public Car(double mpg) {
        this.mpg = mpg;
        this.gallons = 0;
    }

    public void addGas(double gallons) {
        this.gallons += gallons;
    }

    public void drive(double miles) {
        this.gallons -= miles / mpg;
    }

    public double getGasInTank() {
        return gallons;
    }
}
