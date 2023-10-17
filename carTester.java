public class carTester {
    static Car myHybrid;
    public static void main(String... args) {
        myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        System.out.println("Gas remaining: " + myHybrid.getGasInTank());
    }
}
