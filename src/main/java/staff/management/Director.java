package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double payBonus() {
        double currentSalary = super.getSalary();
        return currentSalary * 0.02;
    }

    public double getBudget() {
        return this.budget;
    }
}
