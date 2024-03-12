public class BasketballPlayer extends Athlete {
    private double wingspan;
    private double verticalJump;

    public BasketballPlayer(String name, int age, int numberOnBack, String team, double wingspan, double verticalJump) {
        super(name, age, numberOnBack, 70000, team);
        this.wingspan = wingspan;
        this.verticalJump = verticalJump;
        setSport("Basketball");
    }

    @Override
    public void train(int minutes) {
        System.out.println(getName() + " is throwing free throws for " + minutes + " minutes.");
        super.train(minutes);
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getVerticalJump() {
        return verticalJump;
    }
}
