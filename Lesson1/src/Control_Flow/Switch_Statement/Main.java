package Control_Flow.Switch_Statement;

public class Main {

    public static void main(String[] args) {

        int choice = 4;

        switch (choice) {
            case 1:
                System.out.println("Creating...");
                break;
            case 2:
                System.out.println("Reading...");
                break;
            case 3:
                System.out.println("Updating...");
                break;
            case 4:
                System.out.println("Deleting...");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }



}
