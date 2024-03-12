import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class characterCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        String[] words = input.split(" ");
        int count = words.length;
        int characterCount = input.replace(" ", "").length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }
        System.out.println("Number of words: " + count);
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("String entered: " + input + "\n");
            writer.write("Number of words: " + count + "\n");
            writer.write("Number of characters: " + characterCount + "\n");
            writer.write("Number of uppercase letters: " + upperCaseCount + "\n");
            writer.write("Number of lowercase letters: " + lowerCaseCount + "\n");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        in.close();
    }
}
