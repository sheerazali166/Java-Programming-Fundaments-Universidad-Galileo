package Access_Control_Access_Control_Screencast.Bank;

public class BankTeller {

    public void deposit(BankAccount bankAccount, double amount) {

        boolean result = bankAccount.deposit(amount);

        if (result) {

            System.out.println("Successful deposit of $" + amount);

        } else {

            System.out.println("Error!");

        }
    }

    public void withdraw(BankAccount bankAccount, double amount) {

        boolean result = bankAccount.withdraw(amount);

        if (result) {
            System.out.println("Successful withdraw of $" + amount);

        } else {

            System.out.println("Error!");

        }

    }
}
