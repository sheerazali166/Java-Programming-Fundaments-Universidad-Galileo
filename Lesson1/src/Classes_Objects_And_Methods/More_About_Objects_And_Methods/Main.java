package Classes_Objects_And_Methods.More_About_Objects_And_Methods;

public class Main {

    public static void main(String[] args) {

        Account accountAlice = new Account("Alice", 100);
        Account accountBob = new Account("Bob");

        System.out.println(accountAlice);
        System.out.println(accountBob);

        System.out.println(accountAlice.nextAccount);
        System.out.println(accountBob.nextAccount);

        System.out.println(Account.nextAccount);



    }
}
