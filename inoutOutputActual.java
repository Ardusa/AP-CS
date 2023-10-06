import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class inoutOutputActual {
    double num1, num2;
    public inoutOutputActual(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double sum() {return num1 + num2;}

    double difference() {return num1 - num2;}
    
    double product() {return num1 * num2;}

    double average() {return sum() / 2;}

    double quotient() {return num1 / num2;}

    double modDiv() {return num1 % num2;}
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        num1 = 0;
        num2 = 0;
        System.out.print("First Number: ");
        try {
            num1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("inoutOutputActual.main()");
            System.exit(0);
        } catch (NoSuchElementException e) {
            System.out.println("inoutOutputActual.main()");
            System.exit(0);
        } catch (IllegalStateException e) {
            System.out.println("inoutOutputActual.main()");
            System.exit(0);
        }
        System.out.print("Second Number: ");
        try {
            num2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("inoutOutputActual.main()");
            System.exit(0);
        } catch (NoSuchElementException e) {
            System.out.println("inoutOutputActual.main()");
            System.exit(0);
        } catch (IllegalStateException e) {
            System.out.println("inoutOutputActual.main()");
            System.exit(0);
        }
        inoutOutputActual instance = new inoutOutputActual(num1, num2);
        System.out.println("Sum: " + instance.sum());
        System.out.println("Difference: " + instance.difference());
        System.out.println("Product: " + instance.product());
        System.out.println("Average: " + instance.average());
        System.out.println("Quotient: " + instance.quotient());
        System.out.println("Modulus Division: " + instance.modDiv());
        scanner.close();
    }
}
