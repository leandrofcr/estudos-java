package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawalLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setWithdrawalLimit(Double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdrawal(Double amount) {

        if (amount > getWithdrawalLimit()) {
            throw new IllegalArgumentException("Amount exceeds withdrawal limit");
        }

        if (amount > getBalance()) {
            throw new IllegalArgumentException("Amount exceeds available balance");
        }
        this.balance -= amount;
    }
}
