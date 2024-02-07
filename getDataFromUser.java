import java.util.Scanner;

public class getDataFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] counts = new int[51];

        System.out.println(
                "Enter integers in the range of 0 to 50 inclusive (enter a numebr out of this range to stop): ");
        int num;
        do {
            num = in.nextInt();
            if (num >= 0 && num <= 50) {
                counts[num]++;
            }
        } while (num >= 0 && num <= 50);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " : " + counts[i]);
            }
        }
    }
}
