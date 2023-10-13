public class Balloon {
    private double radius;

    public Balloon() {
        radius = 0;
    }

    public void inflate(double amount) {
        radius += amount;
    }

    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }


    public static void main(String... args) {
        Balloon balloon = new Balloon();
        balloon.inflate(10);
        System.out.println("Balloon volume: " + balloon.getVolume());
    }
}

