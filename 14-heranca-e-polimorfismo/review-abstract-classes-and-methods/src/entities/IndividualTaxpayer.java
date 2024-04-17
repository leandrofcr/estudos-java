package entities;

public class IndividualTaxpayer extends Taxpayer {
    private Double healthcareExpenses;

    public IndividualTaxpayer() {
        super();
    }

    public IndividualTaxpayer(String name, Double annualIncome, Double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public Double totalTaxPaid() {
        double total;

        if (annualIncome < 20000) {
            total = annualIncome * 0.15;
        } else {
            total = annualIncome * 0.25;
        }

        return total - healthcareExpenses / 2;
    }
}
