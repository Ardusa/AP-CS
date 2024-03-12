public class Athlete {
    private String name;
    private int age;
    private int numberOnBack;
    private double salary;
    private String team;
    private String sport;

    private double minutesTrained;

    public Athlete(String name, int age, int numberOnBack, double salary, String team) {
        this.name = name;
        this.age = age;
        this.numberOnBack = numberOnBack;
        this.salary = salary;
        this.team = team;
        minutesTrained = 0;
    }

    public void train(int minutes) {
        minutesTrained += minutes;
    }

    public int getNumberOnBack() {
        return numberOnBack;
    }

    public double getSalary() {
        return salary;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getAge() {
        return age;
    }

    public double getMinutesTrained() {
        return minutesTrained;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNumberOnBack(int numberOnBack) {
        this.numberOnBack = numberOnBack;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nNumber on back: " + numberOnBack + "\nSalary: " + salary + "\nTeam: " + team + "\nSport: " + sport + "\nMinutes trained: " + minutesTrained;
    }
}