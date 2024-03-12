public class Sport {
    public static void main(String[] args) {
        Athlete tennisPlayer = new TennisPlayer("Serena Williams", 39, 23, "Wilson", 128);
        Athlete basketballPlayer = new BasketballPlayer("LeBron James", 39, 92, "Detroit Pistons", 5, 30);
        Athlete soccerPlayer = new SoccerPlayer("Cristiano Ronaldo", 36, 7, "Al-Nassr FC" , 800, 200);

        System.out.println(tennisPlayer.getName() + " is a " + tennisPlayer.getSport() + " player.");
        System.out.println(basketballPlayer.getName() + " is a " + basketballPlayer.getSport() + " player.");
        System.out.println(soccerPlayer.getName() + " is a " + soccerPlayer.getSport() + " player.");
        System.out.println();
        tennisPlayer.train(68);
        basketballPlayer.train(96);
        soccerPlayer.train(72);
        System.out.println();
        System.out.println(tennisPlayer);
        System.out.println();
        System.out.println(basketballPlayer);
        System.out.println();
        System.out.println(soccerPlayer);

    }
}
