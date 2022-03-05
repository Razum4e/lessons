package main332;

public class CheckingAccount extends Account{
    @Override
    void pay(int amount) {
        if (balance - amount < 0) {
            System.out.println("Недостаточно средств.");
            printBalance();
        } else {
            System.out.println("Вы совершили покупку.");
            printBalance();
            balance -= amount;
        }

    }

    @Override
    void transfer(Account account, int amount) {
        if (balance - amount < 0) {
            System.out.println("Недостаточно средств.");
            printBalance();
        } else {
            if (account.addMoney(amount)) {
                balance -= amount;
                System.out.println("С расчетного счета выполнен платеж в кол-ве: " + amount);
                printBalance();
            }
        }
    }

    @Override
    boolean addMoney(int amount) {
        System.out.println("Вы пополнили расчетный счет на: " + amount);
        balance += amount;
        printBalance();
        return true;
    }
}
