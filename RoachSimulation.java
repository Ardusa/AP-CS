public class RoachSimulation {
    RoachPopulation pop;

    public static void main(String[] args) {
        RoachPopulation pop = new RoachPopulation(10);
        pop.breed();
        pop.spray(10);
        System.out.println("Roaches: " + pop.getRoaches());
    }
}
