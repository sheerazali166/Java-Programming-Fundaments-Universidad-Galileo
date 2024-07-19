package Recap_Lesson.Switch_Case_With_Break;

public class Main {

    public static void main(String[] args) {

        int number = 4;

        switch (number) {
            case 1: case 2: case 3: case 4: case 5: {
                System.out.println("The number is between 1 and 5.");
            }
            case 6: case 7: case 8: case 9: case 10: {
                System.out.println("The number is between 6 and 10.");
            }
            default:
                System.out.println("The number is greater than 10");
        }
    }
}
