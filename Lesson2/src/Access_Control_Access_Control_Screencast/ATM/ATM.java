package Access_Control_Access_Control_Screencast.ATM;

import Access_Control_Access_Control_Screencast.Bank.BankAccount;

public class ATM {

    private int id;

    public ATM(int _id) {
        this.id = _id;
    }

    public void withdraw(BankAccount bankAccount, double amount){

        boolean result = bankAccount.withdraw(amount);

        if (result) {
            System.out.println("Successful withdraw on ATM of $" + amount);

        } else {
            System.out.println("Error!");
        }
    }
}
