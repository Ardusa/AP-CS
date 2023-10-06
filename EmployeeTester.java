import java.util.Scanner;

public class EmployeeTester {
    public static Employee harry;
    public static Scanner scanner;

    public EmployeeTester() {
        harry = new Employee("Hacker Harry", 50000);
        // harry.raiseSalary(.1);
        scanner = new Scanner(System.in);
    }

    public static void main(String... args) {
        new EmployeeTester();
        System.out.println("Employee: " + harry.getName());
        System.out.println(harry.getName() + "'s Salary: " + harry.getSalary());
        // System.out.print("Raise " + harry.getName() + "'s Salary by: ");
        // harry.raiseSalary(scanner.nextDouble());
        harry.raiseSalary(.1);
        System.out.println(harry.getName() + "'s New Salary: " + harry.getSalary());
    }
}
