package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public String increaseSalary(double percentage) {
        this.grossSalary = grossSalary + grossSalary * (percentage / 100);
        return "Updated data: "
                + name
                + ", "
                + "$ "
                + String.format("%.2f", netSalary());

    }

    public String toString() {
        return "Employee: "
                + name
                + ", "
                + "$ "
                + String.format("%.2f", netSalary());
    }

}
