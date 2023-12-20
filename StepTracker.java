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
        StepTracker tr = new StepTracker(10000);
        System.out.println("Active days: " + tr.activeDays());
        System.out.println("Average steps: " + tr.averageSteps());
        System.out.println("Adding 9000 steps");
        tr.addDailySteps(9000);
        System.out.println("Active days: " + tr.activeDays());
        System.out.println("Average steps: " + tr.averageSteps());
        System.out.println("Adding 5000 steps");
        tr.addDailySteps(5000);
        System.out.println("Active days: " + tr.activeDays());
        System.out.println("Average steps: " + tr.averageSteps());
        System.out.println("Adding 13000 steps");
        tr.addDailySteps(13000);
        System.out.println("Active days: " + tr.activeDays());
        System.out.println("Average steps: " + tr.averageSteps());
        System.out.println("Adding 23000 steps");
        tr.addDailySteps(23000);
        System.out.println("Active days: " + tr.activeDays());
        System.out.println("Average steps: " + tr.averageSteps());
        System.out.println("Adding 1111 steps");
        tr.addDailySteps(1111);
        System.out.println("Active days: " + tr.activeDays());
        System.out.println("Average steps: " + tr.averageSteps());
    }
}