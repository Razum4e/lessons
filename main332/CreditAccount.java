package main332;

public class CreditAccount extends Account{
    @Override
    void pay(int amount) {
        balance -= amount;
        if (balance < 0) {
            System.out.println("Вы взяли кредит, пополните баланс в количестве: " + (-balance) + "\n");
        }
    }

    @Override
    void transfer(Account account, int amount) {
        System.out.println("С кредитки нельзя проводить операцию перевода." + "\n");
    }

    @Override
    boolean addMoney(int amount) {
        if (balance == 0) {
            System.out.println("Операция провалена. Баланс положительный." + "\n");
            return false;
        } else if (balance < 0){
            if (balance + amount <= 0) {
                balance += amount;
                System.out.println("Вы пополнили кредитный счет на: " + amount);
                printBalance();
                return true;
            } else if (balance + amount > 0) {
                System.out.println("Операция провалена. Слишком большая сумма." + "\n");
                return false;
            }
        }
        return false;
    }
}
