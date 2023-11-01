public class Battery {
    private double capacity;
    private double remaining;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.remaining = capacity;
    }

    public void drain(double amount) {
        remaining -= amount;
    }

    public void charge() {
        remaining = capacity;
    }

    public double getRemaining() {
        return remaining;
    }

    public static void main(String... args) {
        Battery battery = new Battery(100);
        battery.drain(60);
        System.out.println("Battery remaining: " + battery.getRemaining());
        battery.charge();
        System.out.println("Battery remaining after charge: " + battery.getRemaining());
    }
}
