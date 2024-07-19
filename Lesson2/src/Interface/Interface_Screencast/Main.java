package Interface.Interface_Screencast;

/**
 * Main class of the Java program. *
**/

public class Main {

    public static void main(String[] args) {

        Car carTaxi = new Car(4);
        System.out.println("Taxi has wheels? " + carTaxi.hasWheels() + " Number of wheels " + carTaxi.getNumberOfWheels());

        System.out.println("TransportType: " + carTaxi.transportType);
        System.out.println("Wheels: " + carTaxi.wheels);

    }

}
