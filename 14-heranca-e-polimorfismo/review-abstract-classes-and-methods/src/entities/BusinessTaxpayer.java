package entities;

public class BusinessTaxpayer extends Taxpayer {
    private Integer employees;

    public BusinessTaxpayer() {
        super();
    }

    public BusinessTaxpayer(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double totalTaxPaid() {
        if (employees > 10) {
            return annualIncome * 0.14;
        }
        return annualIncome * 0.16;
    }
}
