import java.util.Scanner;

public class thing {
    static long timeout = 500;
    static int num = 243079824;
    public static void main(String[] args) {
        // a
        System.out.println("\na");
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        // b
        System.out.println("\nb");
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);

        // c
        int sum1 = 0;
        System.out.println("\nc");
        for (int i = 0; i <= 20; i++) {
            sum1 += Math.pow(2, i);
        }
        System.out.println(sum1);

    
        // d
        System.out.println("\nd");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);

        // e
        System.out.println("\ne");
        int input = num;
        int sum2 = 0;

        for (int i = 0; i < ("" + input).length(); i++) {
            int num2 = Integer.parseInt(("" + ("" + input).charAt(i)));
            if (num2 % 2 == 1) {
                sum2 += num2;
            }
        }
        System.out.println(sum2);

        // 6.3
        // a
        System.out.println("\n6.3");

        int num1, num2, num3, num4, num5, num6, num7, num8;
        num1 = 18;
        num2 = 12;
        num3 = 21;
        num4 = 1;
        num5 = 5;
        num6 = 8;
        num7 = 20;
        num8 = 22;
        int[] nums = { num1, num2, num3, num4, num5, num6, num7, num8 };
        
        System.out.println("\na");

        int smallest = num1;
        int largest = num1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            } else if (nums[i] > largest) {
                largest = nums[i];
            } else {
                continue;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        // b
        System.out.println("\nb");
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("Evens: " + even);
        System.out.println("Odds: " + odd);

        // c
        System.out.println("\nc");
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            total += num;
            System.out.println(total);
        }

        // d
        System.out.println("\nd");
        for (int i = 0; i < nums.length - 1; i++) {
            int number1 = nums[i];
            int number2 = nums[i + 1];
            if (number1 == number2) {
                System.out.println(number1);
            }
        }
        in.close();
    }
}
