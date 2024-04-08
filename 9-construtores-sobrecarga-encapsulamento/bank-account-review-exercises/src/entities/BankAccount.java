package entities;

public class BankAccount {
    private final int number;
    private String holder;
    private double balance;

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public BankAccount(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return number;
    }

    public String getAccountHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String holder) {
        this.holder = holder;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: "
                + String.format("$ %.2f%n", balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        int WITHDRAWAL_TAX = 5;
        this.balance -= (amount + WITHDRAWAL_TAX);
    }

}
