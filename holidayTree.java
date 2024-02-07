public class holidayTree {

    public holidayTree(int i) {
        if (i == 1) {
            q1();
        } else {
            q2();
        }
    }

    public void q1() {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.print("");
        }
        for (int i = 0; i < 1; i++) {
            for (int x = 0; x < 6; x++) {
                for (int k = 0; k < 6 - x; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x * 2 + 1; j++) {
                    System.out.print("*");
                }
                System.out.print("");
            }
        }
        for (int k = 0; k <= 4; k++)
            System.out.println("    **");
    }

    public void q2() {
        int height = 10;
        int width = 2 * height - 1;
        int star = 1;
        int space = width / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star += 2;
            space--;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < width / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new holidayTree(1);
        new holidayTree(2);
    }
}