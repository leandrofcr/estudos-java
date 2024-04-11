package app.entities;

public class Employee {
    final private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(double percentage) {
        salary += (salary * percentage / 100);
    }

    public String toString() {
        return id
                + ", "
                + name
                + ", "
                + salary;
    }
}
