public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this.name = " ";
        this.salary = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * 
     * @param increase insert decimal value
     */
    public void raiseSalary(double increase) {
        if (increase < 1) {
            increase += 1;
        }
        salary *= increase;
    }
}
