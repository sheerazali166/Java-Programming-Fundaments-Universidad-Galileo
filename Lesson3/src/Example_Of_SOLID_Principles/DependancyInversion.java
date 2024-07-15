package Example_Of_SOLID_Principles;

public class DependancyInversion {

    public static void main(String[] args) {

        // Graphic UserInterface
        UserInterface.getUserInput(new Graphic());
        UserInterface.sendToUserOutput(new Graphic());

        System.out.println();

        // Command Line or Terminal UserInterface
        UserInterface.getUserInput(new CommandLine());
        UserInterface.sendToUserOutput(new CommandLine());

    }
}

final class UserInterface {

    private UserInterface() {;}

    public static void getUserInput(Input input) {

        input.getInput();

    };

    public static void sendToUserOutput(Output output) {
        output.sendOutput();
    }



}

interface Input {
    public void getInput();
}

interface Output {

    public void sendOutput();
}

class Graphic implements Input, Output {

    public Graphic() {;}

    @Override
    public void getInput() {
        System.out.println("Get Mouse Clicks And Movement");
    }

    @Override
    public void sendOutput() {
        System.out.println("Show data Graphically");
    }
}

class CommandLine implements Input, Output {

    public CommandLine() {;}

    @Override
    public void getInput() {
        System.out.println("Get Commands");
    }

    @Override
    public void sendOutput() {
        System.out.println("Print data to terminal");
    }
}





