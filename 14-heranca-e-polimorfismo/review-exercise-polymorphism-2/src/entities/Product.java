package entities;

import java.text.DecimalFormat;

public class Product {
    protected DecimalFormat df = new DecimalFormat("#.00");

    protected String name;
    protected Double price;

    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        return name + " $ " + df.format(price);
    }
}
