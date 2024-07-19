package Access_Control_Access_Control_Screencast.Bank;

public class BankAccount {

    public int number;
    private double balance;

    public BankAccount(int _number, double _balance) {

        this.number = _number;
        this.balance = _balance;

    }

    protected boolean deposit(double amount) {

        if (amount > 0) {
            balance = balance + 1;

            return true;
        }

        return false;
    }

    public boolean withdraw(double amount) {

        if (amount > 0 && balance >= amount) {

            balance = balance - amount;

            return true;

        }

        return false;

    }

}
