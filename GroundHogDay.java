public class GroundHogDay {
    private int year;
    private boolean shadowSeen;
    private boolean correctPrediction;

    public GroundHogDay(int year, boolean shadow, boolean correctPrediction) {
        this.year = year;
        this.shadowSeen = shadow;
        this.correctPrediction = correctPrediction;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setShadowSeen(boolean shadow) {
        this.shadowSeen = shadow;
    }

    public void setCorrectPrediction(boolean correctPrediction) {
        this.correctPrediction = correctPrediction;
    }

    public int getYear() {
        return year;
    }

    public boolean getShadowSeen() {
        return shadowSeen;
    }

    public boolean getCorrectPrediction() {
        return correctPrediction;
    }
}
