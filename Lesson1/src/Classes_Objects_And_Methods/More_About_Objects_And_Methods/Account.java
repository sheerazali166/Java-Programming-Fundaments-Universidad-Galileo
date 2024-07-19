package Classes_Objects_And_Methods.More_About_Objects_And_Methods;

public class Account {

    public static int nextAccount = 1;

    public String name;
    public int accountNumber;
    public int balance;

    public Account(String _name) {

        name = new String(_name);
        accountNumber = nextAccount;
        balance = 0;

        nextAccount = nextAccount + 1;

    }

    public Account(String _name, int _balance) {

        name = new String(_name);
        accountNumber = nextAccount;
        balance = _balance;

        nextAccount = nextAccount + 1;

    }

    public void deposit(int _balance) {
        balance = balance + _balance;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nAccount number: " + accountNumber + "\nBalance: " + balance;
    }
}
