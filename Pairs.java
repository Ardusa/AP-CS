import java.util.Scanner;

public class Pairs {
    int[] nums;

    public Pairs(int... nums) {
        this.nums = nums;
    }
    
    public String howManyPairs() {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    count++;
                }
            }
        }
        if (count != 2) {
            return "There are not 2 pairs.";
        } else {
            return "There are 2 pairs.";
        }
    }

    public int[] sort() {
        int[] sorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] > num) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = num;
        }
        return sorted;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.print("Enter integer 1: ");
        n1 = in.nextInt();
        System.out.print("Enter integer 2: ");
        n2 = in.nextInt();
        System.out.print("Enter integer 3: ");
        n3 = in.nextInt();
        System.out.print("Enter integer 4: ");
        n4 = in.nextInt();

        Pairs p = new Pairs(n1, n2, n3, n4);

        System.out.print("Sorted: " + p.sort()[0] + " " + p.sort()[1] + " " + p.sort()[2] + " " + p.sort()[3]);
        System.out.print("\t\t" + p.howManyPairs());
        
    }
}