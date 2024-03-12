public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getVacation() {
        return "Manager receives 3 weeks of vacation!";
    }

    @Override
    public String toString() {
        return "Manager [name=" + getName() + ", salary=" + getSalary() + ", department=" + department + "]";
    }
}
