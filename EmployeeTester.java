public class EmployeeTester {
    public static Employee harry;

    public EmployeeTester() {
        harry = new Employee("Hacker Harry", 50000);
    }

    public static void main(String... args) {
        new EmployeeTester();
        System.out.println("Employee: " + harry.getName());
        System.out.println(harry.getName() + "'s Salary: " + harry.getSalary());
        harry.raiseSalary(.1);
        System.out.println(harry.getName() + "'s New Salary: " + harry.getSalary());
    }
}
