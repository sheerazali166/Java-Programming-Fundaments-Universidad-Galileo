package Classes_Objects_And_Methods.Choosing_The_Correct_type;

public class Account {

    public static int nextAccount = 1;

    public String name;
    public int accountNumber;
    public short balance;

    public Account(String _name) {

        name = new String(_name);
        balance = 0;

        nextAccount = nextAccount + 1;

    }

    public Account(String number, short _balance) {

        name = new String(number);
        accountNumber = nextAccount;
        this.balance = _balance;

        nextAccount = nextAccount + 1;

    }

    public void deposit(short _balance) {

        // you can't defend chhakkle wali
        // agar rakhel hai khudh khilao aur apni jeb se khilao
        // aur apna nam kharab karo

        balance = (short) (balance + _balance);

    }

    public String toString() {
        return "\nname: " + name + "\naccount number: " + accountNumber +  "\nbalance: " + balance;
    }

}
