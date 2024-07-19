package Recap_Lesson.Assign_The_Result_Of_The_Method;

public class Main {

    public static boolean isEven(int number) {

        int result = number % 2;

        if (result > 0) {

            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        int number = 143;
        boolean isEven = isEven(number);

        if (isEven) {
            System.out.println(number + " is an even number");
        
        } else if (!isEven) {
            System.out.println(number + " is an odd number");
        }

        System.out.println(127 - 143);
        System.out.println(127 - 147);
        System.out.println(127 - 149);

        System.out.println("I also love sanam javed");
    }
}
