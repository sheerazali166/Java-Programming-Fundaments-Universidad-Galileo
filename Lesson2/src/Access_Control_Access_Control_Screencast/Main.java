package Access_Control_Access_Control_Screencast;

import Access_Control_Access_Control_Screencast.ATM.ATM;
import Access_Control_Access_Control_Screencast.Bank.BankAccount;
import Access_Control_Access_Control_Screencast.Bank.BankTeller;

/**
 * Main class of the Java program. *
**/

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1234, 100.00);
        BankTeller bankTellerJohn = new BankTeller();

        bankTellerJohn.deposit(bankAccount, 100.00);

        ATM atmXYZ = new ATM(222);
        atmXYZ.withdraw(bankAccount, 50.00);

    }
}
