import java.util.Scanner;

public class lexigraphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter word 1: ");
        String s1 = in.next();

        System.out.print("Enter word 2: ");
        String s2 = in.next();

        System.out.print("Enter word 3: ");
        String s3 = in.next();

        if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0) {
            if (s2.compareTo(s3) < 0) {
                System.out.println(s1 + " " + s2 + " " + s3);
            } else {
                System.out.println(s1 + " " + s3 + " " + s2);
            }
        } else if (s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0) {
            if (s1.compareTo(s3) < 0) {
                System.out.println(s2 + " " + s1 + " " + s3);
            } else {
                System.out.println(s2 + " " + s3 + " " + s1);
            }
        } else {
            if (s1.compareTo(s2) < 0) {
                System.out.println(s3 + " " + s1 + " " + s2);
            } else {
                System.out.println(s3 + " " + s2 + " " + s1);
            }
        }
        in.close();
    }
}