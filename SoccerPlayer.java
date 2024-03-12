public class SoccerPlayer extends Athlete {
    private int goalsScored;
    private int assists;

    public SoccerPlayer(String name, int age, int numberOnBack, String team, int goalsScored, int assists) {
        super(name, age, numberOnBack, 80000, team);
        this.goalsScored = goalsScored;
        this.assists = assists;
        setSport("Soccer");
    }

    public String getSport() {
        return super.getSport();
    }

    @Override
    public void train(int minutes) {
        System.out.println(getName() + " is training penalty shots for " + minutes + " minutes.");
        super.train(minutes);
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }
}
