package Control_Flow.BranchingStatement_Continue;

public class Main {

    public static void main(String[] args) {

        int number = 1;
        int number2 = 11;
        int number3 = -11;
        String value = loopNumber(number3);
        System.out.println(value);

    }

    public static String loopNumber(int newNumber) {

        while (newNumber >= 0) {
             if (newNumber < 10) {
                 newNumber++;
                 continue;
             }
            System.out.println(newNumber);
            return "Done";
        }
        return newNumber + " is negative";
    }
}
