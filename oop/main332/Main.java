package main332;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
                new SavingsAccount(),
                new CreditAccount(),
                new CheckingAccount()
        };
        accounts[0].setBalance(10000);
        accounts[1].pay(100);
        accounts[0].transfer(accounts[1], 99);
        accounts[0].transfer(accounts[1], 99);
        accounts[0].transfer(accounts[1], 1);
        accounts[0].transfer(accounts[1], 99);
    }
}