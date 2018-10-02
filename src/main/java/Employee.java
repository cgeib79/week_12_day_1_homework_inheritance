public class Employee {

    private String name;
    private int ninumber;
    private int salary;
    private double raise;
    private double bonus;

    public Employee(String name, int ninumber, int salary, double raise, double bonus){
        this.name = name;
        this.ninumber = ninumber;
        this.salary = salary;
        this.raise = raise;
        this.bonus = bonus;
    }

    public String getName() {
        return this.name;
    }

    public int hasNiNumber() {
        return this.ninumber;
    }

    public int hasSalary() {
        return this.salary;
    }

    public double raiseSalary() {
        return this.raise;
    }

    public double payBonus() {
        return this.bonus;
    }
}
