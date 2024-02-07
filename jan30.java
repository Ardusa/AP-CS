import java.util.ArrayList;

public class jan30 {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        ArrayList<String> strArr2 = new ArrayList<>();

        strArr.add("it");
        strArr.add("was");
        strArr.add("a");
        strArr.add("stormy");
        strArr.add("night");

        strArr.add(3, "dark");
        strArr.add(4, "and");

        strArr2.addAll(strArr);

        strArr.set(1, "is");

        for (int x = 0; x < strArr.size(); x++) {
            for (int y = 0; y < strArr.get(x).length(); y++) {
                if (strArr.get(x).charAt(y) == 'a') {
                    strArr.remove(x);
                    x -= 1;
                }
            }
        }

        System.out.println(strArr);

        System.out.println("Now using strArr2: " + strArr2);

        ArrayList<Integer> intArr = new ArrayList<>();

        for (int i = 0; intArr.size() < 10; i += 2) {
            intArr.add(i);
        }

        System.out.println(intArr);

        System.out.println("Max length: " + maxLength(strArr2));

        System.out.println("Contains 'is': " + containsIs(strArr2));

        System.out.println("Index of 'dark': " + indexOfDark(strArr2));

        System.out.println("Index of 'stormy': " + indexOfStormy(strArr2));

        printUppercase(strArr2);
    }
    
    public static int maxLength(ArrayList<String> arr) {
        if (arr.isEmpty()) {
            return 0;
        }

        int max = arr.get(0).length();

        for (String str : arr) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        return max;
    }

    public static boolean containsIs(ArrayList<String> arr) {
        for (String str : arr) {
            if (str.contains("is")) {
                return true;
            }
        }
        return false;
    }

    public static int indexOfDark(ArrayList<String> arr) {
        return arr.lastIndexOf("dark");
    }

    public static int indexOfStormy(ArrayList<String> arr) {
        return arr.lastIndexOf("stormy");
    }
    
    public static void printUppercase(ArrayList<String> arr) {
        for (String str : arr) {
            System.out.println(str.toUpperCase());
        }
    }
}
