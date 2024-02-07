import java.util.Random;

public class Card {
    private static Random random = new Random();
    private String suit;
    private int number;
    private String face = null;
    private boolean isFace;

    /** Specific Card */
    public Card(String suit, int number) {
        this.suit = suit;
        this.number = number;
        if (number > 10) {
            isFace = true;
            switch (number) {
                case 11:
                    face = "Jack";
                    break;
                case 12:
                    face = "Queen";
                    break;
                case 13:
                    face = "King";
                    break;
                case 14:
                    face = "Ace";
                    break;
                default:
                    System.out.println("Card.Card:31\tError: Invalid Card Number");
                    System.exit(1);
                    break;
            }
        } else {
            isFace = false;
        }
    }
    
    /** Random Card */
    public Card() {
        this(randomSuit(), random.nextInt(14) + 1);
    }

    @Override
    public String toString() {
        if (isFace) {
            return face + " of " + suit;
        } else {
            return number + " of " + suit;
        }
    }

    public String getSuit() {
        return suit.toString();
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int x) {
        number = x;
    }

    public String getFace() {
        return face.toString();
    }

    public void setFace(String face) {
        this.face = face;
    }

    public boolean isFace() {
        return isFace;
    }

    private static String randomSuit() {
        switch (random.nextInt(4) + 1) {
            case 1:
                return "Hearts";
            case 2:
                return "Diamonds";
            case 3:
                return "Clubs";
            case 4:
                return "Spades";
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Card card = new Card();
        System.out.println(card);
        card.setNumber(11);
        card.setFace("JACK");
        card.setSuit("CLUBS");
        System.out.println(card);
        System.out.println(card.getSuit());
        System.out.println(card.getNumber());
        System.out.println(card.getFace());
        System.out.println(card.isFace());
    }
}