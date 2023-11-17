/**
 * When you use an automated teller machine (ATM) with
 * your bank card, you need to use a personal identification
 * number (PIN) to access your account. If a user fails more
 * than three times when entering the PIN, the machine will
 * block the card. Assume that the user’s PIN is “1234” and
 * write a program that asks the user for the PIN no more than
 * three times, and does the following:
 * • If the user enters the right number, print a message saying, “Your PIN is
 * correct”, and end the program.
 * • If the user enters a wrong number, print a message saying, “Your PIN is
 * incorrect” and, if you have asked for the PIN less than three times, ask for
 * it
 * again.
 * • If the user enters a wrong number three times, print a message saying “Your
 * bank card is blocked” and end the program.
 */

public class ATM {
    private final String pin = "1234";
    private int attempts = 0;
    
    public ATM() {
    }
    
    public void checkPin(String pin) {
        if (this.pin.equals(pin)) {
            System.out.println("Your PIN is correct");
            System.exit(0);
        } else {
            System.out.println("Your PIN is incorrect");
            if (attempts < 2) {
                attempts++;
            } else {
                System.out.println("Your bank card is blocked");
                System.exit(0);
            }
        }
    }

    public static void main(String... args) {
        ATM atm = new ATM();
        atm.checkPin("1235");
        atm.checkPin("1236");
        atm.checkPin("1237");
    }
}
