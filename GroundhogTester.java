public class GroundhogTester {
    public static void main(String[] args) {
        GroundHogDay[] DeQuavious = new GroundHogDay[5];
        DeQuavious[0] = new GroundHogDay(2013, true, true);
        DeQuavious[1] = new GroundHogDay(2014, false, false);
        DeQuavious[2] = new GroundHogDay(2015, true, false);
        DeQuavious[3] = new GroundHogDay(2016, true, true);
        DeQuavious[4] = new GroundHogDay(2017, false, false);

        GroundHogDay[] Jamal = new GroundHogDay[5];
        Jamal[0] = new GroundHogDay(2013, false, false);
        Jamal[1] = new GroundHogDay(2014, false, true);
        Jamal[2] = new GroundHogDay(2015, true, false);
        Jamal[3] = new GroundHogDay(2016, false, true);
        Jamal[4] = new GroundHogDay(2017, true, false);

        GroundHogDay[] Tyrone = new GroundHogDay[5];
        Tyrone[0] = new GroundHogDay(2013, false, true);
        Tyrone[1] = new GroundHogDay(2014, false, false);
        Tyrone[2] = new GroundHogDay(2015, true, true);
        Tyrone[3] = new GroundHogDay(2016, false, true);
        Tyrone[4] = new GroundHogDay(2017, true, false);

        System.out.println();
        System.out.println("DeQuavious Data");
        System.out.println("    Year              Shadow Seen   Correct Prediction   Prediction Rate");
        System.out.println("-----------------------------------------------------------------------------");
        for (GroundHogDay day : DeQuavious) {
            System.out.printf("    %d \t\t %b \t\t %b \t\t %s \n", day.getYear(),
                    day.getShadowSeen(),
                    day.getCorrectPrediction(),
                    averageCorrect(DeQuavious));
            ;
        }
        System.out.println();
        System.out.println("Jamal Data");
        System.out.println("    Year              Shadow Seen   Correct Prediction   Prediction Rate");
        System.out.println("-----------------------------------------------------------------------------");
        for (GroundHogDay day : Jamal) {
            System.out.printf("    %d \t\t %b \t\t %b \t\t %s \n", day.getYear(),
                    day.getShadowSeen(),
                    day.getCorrectPrediction(),
                    averageCorrect(Jamal));
        }
        System.out.println();
        System.out.println("Tyrone Data");
        System.out.println("    Year              Shadow Seen   Correct Prediction   Prediction Rate");
        System.out.println("-----------------------------------------------------------------------------");
        for (GroundHogDay day : Tyrone) {
            System.out.printf("    %d \t\t %b \t\t %b \t\t %s \n", day.getYear(),
                    day.getShadowSeen(),
                    day.getCorrectPrediction(),
                    averageCorrect(Tyrone));
        }

        double temp = averageCorrect(DeQuavious);
        String name = "DeQuavious";
        if (averageCorrect(Jamal) > temp) {
            temp = averageCorrect(Jamal);
            name = "Jamal";
        }
        if (averageCorrect(Tyrone) > temp) {
            temp = averageCorrect(Tyrone);
            name = "Tyrone";
        }
        System.out.println();
        System.out.println("The most accurate prediction rate is " + name + " with " + temp + "% accuracy!");
    }

    public static int largestRun(GroundHogDay[] days) {
        int maxRun = 0;
        int currentRun = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i].getShadowSeen()) {
                currentRun++;
            } else {
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
                currentRun = 0;
            }
        }
        return maxRun;
    }

    public static double percentCorrect(GroundHogDay[] days) {
        int correct = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i].getShadowSeen() == days[i].getCorrectPrediction()) {
                correct++;
            }
        }
        return (correct / days.length) * 100;
    }

    public static double averageCorrect(GroundHogDay[] days) {
        double correct = 0d;
        for (int i = 0; i < days.length; i++) {
            if (days[i].getShadowSeen() == days[i].getCorrectPrediction()) {
                correct++;
            }
        }
        return correct / 5d * 100d;
    }
}
