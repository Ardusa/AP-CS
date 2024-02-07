public class Canidate {
    private int numVotes;
    private String name;

    public Canidate(String name, int numVotes) {
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return numVotes;
    }

    public void setVotes(int n) {
        numVotes = n;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name + " recieved " + numVotes + " votes.";
    }
}
