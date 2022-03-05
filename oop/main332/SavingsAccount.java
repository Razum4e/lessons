package main332;

public class SavingsAccount extends Account{
    @Override
    void pay(int amount) {
        System.out.println("Со сбера нельзя проводить операцию оплаты." + "\n");
    }

    @Override
    void transfer(Account account, int amount) {
        if (balance - amount < 0) {
            System.out.println("Недостаточно средств.");
            printBalance();
        } else {
            if (account.addMoney(amount)) {
                balance -= amount;
                System.out.println("С сбер. счета выполнен платеж в кол-ве: " + amount);
                printBalance();
            }
        }
    }
    @Override
    boolean addMoney(int amount) {
        System.out.println("Вы пополнили сбер. счет на: " + amount);
        balance += amount;
        printBalance();
        return true;
    }
}
