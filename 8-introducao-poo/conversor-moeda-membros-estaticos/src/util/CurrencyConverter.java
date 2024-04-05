package util;

public class CurrencyConverter {
    public static final double IOF_TAX = 0.06;

    public static double convertCurrency(double amount, double price) {
        double total = amount * price;
        return total + (total * IOF_TAX);

    }
}
