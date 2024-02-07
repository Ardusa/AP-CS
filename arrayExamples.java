public class arrayExamples {
    public static void main(String[] args) {
        int arr[] = new int[20];
        fillArray(arr);

        int max = arr[0];
        int min = arr[0];
        int total = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            total += num;
        }
        double average = total / arr.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }
}
