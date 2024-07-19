package Control_Flow.Screencast_If_Then_Statement_And_Switch_Case.If_Then_Statement;

public class Main {

    public static void main(String[] args) {

        String weather = "rainy";
        // String weather = "sunny";
        // String weather = "windy";
        // String weather = "snowy";

        if (weather.equals("rainy")) {
            System.out.println("Don't forget to bring your umbrella");

        } else if (weather.equals("sunny")) {
            System.out.println("Don't forget your sunglasses");

        } else if (weather.equals("windy")) {
            System.out.println("Don't forget to bring your coat");

        } else {
            System.out.println("Enjoy the snow!");
        }

    }

}
