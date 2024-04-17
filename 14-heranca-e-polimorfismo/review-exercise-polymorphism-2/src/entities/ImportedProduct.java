package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " (Customs fee: $ " + df.format(customsFee) + ")";
    }
}
