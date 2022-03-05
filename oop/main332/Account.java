package main332;

public abstract class Account {
    protected int balance = 0;

    abstract void pay(int amount);
    abstract void transfer(Account account, int amount);
    abstract boolean addMoney(int amount);
    public void printBalance() {
        System.out.println(toString());
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Баланс: " + balance + "\n";
    }
}
