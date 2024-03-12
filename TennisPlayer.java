public class TennisPlayer extends Athlete {
    private String racket;
    private double serveSpeed;

    public TennisPlayer(String name, int age, int numberOnBack, String racket, double serveSpeed) {
        super(name, age, numberOnBack, 40000, "None");
        this.racket = racket;
        this.serveSpeed = serveSpeed;
        setSport("Tennis");
    }
    
    @Override
    public void train(int minutes) {
        System.out.println(getName() + " is practicing serves for " + minutes + " minutes.");
        super.train(minutes);
    }

    public String getRacket() {
        return racket;
    }

    public double getServeSpeed() {
        return serveSpeed;
    }
}