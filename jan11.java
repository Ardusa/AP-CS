import java.util.Random;

public class jan11 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        nums = randArray(nums);

        System.out.print("Every element at even index: ");
        for (int x = 0; x < nums.length; x++) {
            if (x % 2 == 0) {
                System.out.print(nums[x] + " ");
            }
        }
        System.out.println();

        System.out.print("Every even element: ");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("All elements in reverse order: ");
        for (int z = nums.length - 1; z >= 0; z--) {
            System.out.print(nums[z] + " ");
        }
        System.out.println();

        System.out.println("First element: " + nums[0]);
        System.out.println("Last element: " + nums[nums.length - 1]);
    }

    public static int[] randArray(int[] arr) {
        System.out.print("Array: ");
        for (int x = 0; x < arr.length; x++) {
            arr[x] = new Random().nextInt(100);
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        return arr;
    }
}
