package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raiseAmount) {
        if (raiseAmount > 1) {
            this.salary = this.salary * raiseAmount;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }


    // tested in ManagerTest file
    public void changeName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

 }
