public class RoachPopulation {
    private int population;

    public RoachPopulation(int initialPopulation) {
        population = initialPopulation;
    }
    
    public void breed() {
        population *= 2;
    }

    public void spray(double percent) {
        population -= (int) (population * percent / 100);
    }

    public int getRoaches() {
        return population;
    }
}