package entities;

import java.text.DecimalFormat;

public abstract class Taxpayer {
    private String name;
    protected Double annualIncome;

    public Taxpayer() {
    }

    public Taxpayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double totalTaxPaid();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return name + ": $ " + df.format(totalTaxPaid());
    }
}
