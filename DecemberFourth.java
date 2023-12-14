import java.util.Scanner;
import java.util.Vector;

public class DecemberFourth {
    Vector<Character> v = new Vector<Character>();
    Scanner in = new Scanner(System.in);
    
    public DecemberFourth() {
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        v.add('y');
    }

    public void output() {
        System.out.print("Enter a word: ");
        String word = in.next();
        int count = 0;

        for (Character c : word.toCharArray()) {
            if (v.contains(c)) {
                count++;
            }
        }

        System.out.println("There are " + count + " vowels in " + word);
    }

    public static void main(String[] args) {
        DecemberFourth ds = new DecemberFourth();
        ds.output();
    }
}
