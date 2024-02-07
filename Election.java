public class Election {
    public static void main(String[] args) {
        Canidate[] election = new Canidate[5];
        election[0] = new Canidate("Lucy Robertson", 6000);
        election[1] = new Canidate("Marie Grace", 2400);
        election[2] = new Canidate("Rusty Jordan", 1800);
        election[3] = new Canidate("Kris McRay", 2500);
        election[4] = new Canidate("Samantha Ross", 1800);

        System.out.println("Raw Election Data:");
        System.out.println();
        printVotes(election);
        System.out.println("\n");

        System.out.println("Election Results");
        System.out.println();
        printResults(election);

    }
    
    public static void printVotes(Canidate[] canidates) {
        for (Canidate c : canidates) {
            System.out.println(c);
        }
    }

    public static int getTotal(Canidate[] canidates) {
        int sum = 0;
        for (Canidate c : canidates) {
            sum += c.getVotes();
        }
        return sum;
    }

    public static void printResults(Canidate[] canidates) {
        // for (Canidate c : canidates) {
        //     System.out.println(c);
        // }

        int total;

        total = getTotal(canidates);

        System.out.println("                      Votes            % of Total");
        System.out.println("Canidate             Recieved             Votes");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < canidates.length; i++) {
            System.out.printf("%-15s %10d %15.2f %n", canidates[i].getName(), canidates[i].getVotes(), (canidates[i].getVotes() / (double)total) * 100);
        }
        System.out.println("-------------------------------------------------");
    }

}
