public class StepTracker {
    int minSteps;
    int steps, days, activeDays;

    public StepTracker(int x) {
        minSteps = x;
        steps = 0;
        days = 0;
        activeDays = 0;
    }

    /* Information about steps */
    public void addDailySteps(int x) {
        days++;
        steps += x;
        if (x >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (days == 0) {
            return 0;
        }
        return (double) steps / days;
    }

    public static void main(String[] args) {
        StepTracker cs = new StepTracker(10000);
        System.out.println("Adding 20000 steps on Monday");
        cs.addDailySteps(20000);
        System.out.println("Adding 25000 steps on Tuesday");
        cs.addDailySteps(25000);
        System.out.println("Adding 15000 steps on Wednesday");
        cs.addDailySteps(15000);
        System.out.println("Active days: " + cs.activeDays());
        System.out.println("Average steps: " + cs.averageSteps());
    }
}
