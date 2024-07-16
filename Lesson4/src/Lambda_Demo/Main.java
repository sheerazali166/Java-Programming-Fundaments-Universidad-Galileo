package Lambda_Demo;

public class Main {

    /**
     * Java old days demonstration
    **/

    public void doInTheOldWay() {
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void doSomethingFuctional(String text) {
                System.out.println(text);
            }
        };
        myFunctionalInterface.doSomethingFuctional("Hello in the old way");
    }

    public void doItWithLambdas() {

        MyFunctionalInterface myFunctionalInterfaceOne = (String x) -> System.out.println(x);
        myFunctionalInterfaceOne.doSomethingFuctional("Hello from lambda fashion");

        MyFunctionalInterface myFunctionalInterfaceTwo = x -> System.out.println(x);
        myFunctionalInterfaceTwo.doSomethingFuctional("Hello from short syntax");

        MyFunctionalInterface myFunctionalInterfaceThree = x -> {
            myFunctionalInterfaceTwo.doSomethingFuctional("Hello from complex syntax");
            System.out.println(x);
            System.out.println("Bye from the complex syntax");
        };
        myFunctionalInterfaceThree.doSomethingFuctional("Regular code in complex syntax");
        doSomethingHighOrder(myFunctionalInterfaceThree);

    }

    public void doSomethingHighOrder(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.doSomethingFuctional("in high order way");
    }

    public static void main(String[] args) {

        Main main = new Main();

        // Calling the old implementation
        // main.doItInTheOldWay();
        main.doItWithLambdas();

        MyFunctionalInterface myFunctionalInterfaceA = System.out::println;
        main.doSomethingHighOrder(myFunctionalInterfaceA);

        MyFunctionalInterface myFunctionalInterfaceB = x -> {
           x = "Doing something".concat(x);
            System.out.println(x);
            System.out.println("Making java great again");
        };
        main.doSomethingHighOrder(myFunctionalInterfaceB);

    }
}
