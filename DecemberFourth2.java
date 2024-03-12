import java.util.Scanner;

public class DecemberFourth2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.println(word.substring(i, j + 1));
            }
        }
        in.close();
    }
}
