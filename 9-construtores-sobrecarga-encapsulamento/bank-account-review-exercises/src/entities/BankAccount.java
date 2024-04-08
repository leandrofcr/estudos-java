package entities;

public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
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
