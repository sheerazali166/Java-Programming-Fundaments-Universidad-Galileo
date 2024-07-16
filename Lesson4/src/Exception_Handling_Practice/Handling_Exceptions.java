package Exception_Handling_Practice;

public class Handling_Exceptions {

    public static void main(String[] args) throws Exception {

        //Limit $2000.00
        CreditCard creditCard = new CreditCard(62656565, 2000.0);
        System.out.println("Credit Card State:");
        System.out.println(creditCard.getCreditState());

        try {
            System.out.println("\n\tBuying $1500.00");
            creditCard.buy(1500.00);

            System.out.println("\nCredit Card State:");
            System.out.println(creditCard.getCreditState());

            System.out.println("\n\tBuying $800.00\n");
            creditCard.buy(800.00);

        } catch (ExceededCreditCardLimitException exceededCreditCardLimitException) {
            System.out.println("Invalid Buy, Limit Exceeded by " + exceededCreditCardLimitException.getExceededAmount());
            exceededCreditCardLimitException.printStackTrace(); // Print Stack Trace

        }

    }
}

class CreditCard {

    private double creditAvailable, limit;
    private int number;

    public CreditCard(int _number, double _limit) {
        this.number = _number;
        this.creditAvailable = _limit;
        this.limit = _limit;

    }

    public void paidCreditCard(double amount) {
        creditAvailable += amount;
    }

    public void buy(double amount) throws ExceededCreditCardLimitException {

        if (amount <= creditAvailable) {
            this.creditAvailable -= amount;

        } else {
           double exceeded = amount - creditAvailable;
           throw new ExceededCreditCardLimitException(exceeded);

        }
    }

    public String getCreditState() {
        return "Credit Available: $" + this.creditAvailable + "Credit Limit: $" + this.limit;
    }

    public double getCreditAvailable() {
        return this.creditAvailable;
    }

    public double getLimit() {
        return this.limit;
    }

    public int getNumber() {
        return this.number;
    }
}

class ExceededCreditCardLimitException extends Exception {

    private double exceededAmount;

    public ExceededCreditCardLimitException(double _exceededAmount) {
        this.exceededAmount = _exceededAmount;
    }
    public double getExceededAmount() {
        return exceededAmount;
    }

}