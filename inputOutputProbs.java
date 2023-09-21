public class inputOutputProbs {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }

    public static void question1() {
        int x = 8;
        System.out.println("The number " + x + " squared is: " + Math.pow(x, 2) + "\nThe number " + x + " cubed is: " + Math.pow(x, 3));
    }

    public static void question2() {
        double temp;
        temp = 75.4;
        System.out.println("The temperature is " + temp + " degrees Fahrenheit.");
        double Celsius = (temp - 32) * 5 / 9;
        System.out.println("the temperature in Celsius is " + Math.round(Celsius));
    }

    public static void question3() {
        int x1 = 5;
        int y1 = 10;
        int z1 = 15;

        double x2 = 7.2;
        double y2 = 3.5;
        double z2 = 6.9;

        System.out.println("The sum of " + x1 + ", " + y1 + ", and " + z1 + " is " + (x1 + y1 + z1));
        System.out.println("The sum of " + x2 + ", " + y2 + ", and " + z2 + " is " + (x2 + y2 + z2));
        System.out.println("The difference of " + x1 + ", " + y1 + ", and " + z1 + " is " + (x1 - y1 - z1));
        System.out.println("The difference of " + x2 + ", " + y2 + ", and " + z2 + " is " + (x2 - y2 - z2));
        System.out.println("The product of " + x1 + ", " + y1 + ", and " + z1 + " is " + (x1 * y1 * z1));
        System.out.println("The product of " + x2 + ", " + y2 + ", and " + z2 + " is " + (x2 * y2 * z2));
        System.out.println("The average of " + x1 + ", " + y1 + ", and " + z1 + " is " + (x1 + y1 + z1) / 3);
        System.out.println("The average of " + x2 + ", " + y2 + ", and " + z2 + " is " + (x2 + y2 + z2) / 3);
        System.out.println("The quotient of " + x1 + ", " + y1 + ", and " + z1 + " is " + (x1 / y1 / z1));
        System.out.println("The quotient of " + x2 + ", " + y2 + ", and " + z2 + " is " + (x2 / y2 / z2));
    }
}
