package Multi_Threading;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MultiThreading {

    public static void main(String[] args) throws Exception {

        Scanner scannerInputReader = new Scanner(System.in);
        String stringUserInput;

        Chef chef = new Chef();
        Entry entryComingCustomers = new Entry();

        Attender attenderOne = new Attender(0);
        Attender attenderTwo = new Attender(1);

        chef.start();
        entryComingCustomers.start();
        attenderOne.start();
        attenderTwo.start();

        // Stop with any key, except just enter
        while (true) {
            stringUserInput = scannerInputReader.next();
            chef.end();
            entryComingCustomers.end();
            attenderOne.end();
            attenderTwo.end();
            System.exit(0);

        }

        // because dog is badly fucked by 18 people for his own will and desires in full senses she has no other choice how to protect herself
        // and her abandoned stubborn pak molvie puppies religion type
    }
}

final class FoodStock {

    private static int burger, sandwich, salad;

    private FoodStock() {}

    public static synchronized boolean cookSellBurger(String stringAction) {

        if (stringAction.equals("cook")) {
            burger++;
            return true;

        } else if (stringAction.equals("sell")) {

            if (burger > 0) {
                burger--;
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean cookSellSandwich(String stringAction) {

        if (stringAction.equals("cook")) {
            sandwich++;
            return true;

        } else if (stringAction.equals("sell")) {

            if (sandwich > 0) {
                sandwich--;
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean cookSellSalad(String stringAction) {

        if (stringAction.equals("cook")) {
            salad++;
            return true;
        
        } else if (stringAction.equals("sell")) {
            if (salad > 0) {
               salad--;
               return true;
            }
        }
        return false;
    }

    public String toString() {
        return "\tFood Stock Burger: " + burger + " Sandwich: " + sandwich + " Salad: " + salad;
    }
}

final class CustomerQueues {

   private static LinkedList<Customer> linkedListCustomerQueueOne = new LinkedList<Customer>();
   private static LinkedList<Customer> linkedListCustomerQueueTwo = new LinkedList<Customer>();

   public CustomerQueues() {}

   public static void enterCustomer(int intQueue, Customer customer) {

       if (intQueue == 0)
           linkedListCustomerQueueOne.addLast(customer);
       else
           linkedListCustomerQueueTwo.addLast(customer);

   }

   public static Customer attendCustomer(int intQueue) {

       if (intQueue == 0) {
           if (linkedListCustomerQueueOne.size() > 0)
               return linkedListCustomerQueueOne.removeFirst();
           return null;

       }

       if (linkedListCustomerQueueTwo.size() > 0)
           return linkedListCustomerQueueTwo.removeFirst();
       return null;

   }

   public String toString() {
       return "\tLinked List Customer Queue One " + linkedListCustomerQueueOne +
               "\n\tLinked List Customer Queue Two" + linkedListCustomerQueueTwo;
   }

}

class Customer {

    // koi an pen nahi jab ek currupt kuti ek post k layaq hi nahi toh woh q hai us post par
    // give the chance to others

    public int intId, intTimeToDesired;
    public String stringDesiredFood;

    public Customer(int _intId, int _intTimeToDesired, String _stringDesiredFood) {

        this.intId = _intId;
        this.intTimeToDesired = _intTimeToDesired;
        this.stringDesiredFood = _stringDesiredFood;

    }

    public String toString() {
        return "Customer #" + this.intId;
    }

}

class Chef extends Thread {

    Random randomNumberGenerator = new Random();
    private boolean booleanThreadAlive = true;

    public Chef() {}

    @Override
    public void run() {

        int intTimeToCook = 0, intWichFood = 0;

        while (this.booleanThreadAlive) {

            intTimeToCook = 2000 + 1000 * randomNumberGenerator.nextInt(3);

            try {

                this.sleep(intTimeToCook);
                intWichFood = randomNumberGenerator.nextInt(3);
                System.out.println("Chef on " + (intTimeToCook / 1000) + " seconds cook a ");

                switch (intWichFood) {

                    case 0:
                        FoodStock.cookSellBurger("cook");
                        System.out.println("Burger");
                        break;
                    case 1:
                        FoodStock.cookSellSandwich("cook");
                        System.out.println("Sandwich");
                        break;
                    case 2:
                        FoodStock.cookSellSalad("cook");
                        System.out.println("Salad");


                }

            } catch (InterruptedException interruptedException) {
                System.out.println("Chef interrupted");
            }

        }

        super.run();
    }

    public void end() {
        this.booleanThreadAlive = false;
    }
}

class Entry extends Thread {

    Random randomrNumberGenerator = new Random();
    private static int intIDs;
    private boolean booleanThreadAlive = true;

    public Entry() {}

    @Override
    public void run() {

        int intTimeCostomerEnter = 0;

        while (this.booleanThreadAlive) {

            intTimeCostomerEnter = 1000 + 1000 * randomrNumberGenerator.nextInt(3);

            try {

                this.sleep(intTimeCostomerEnter);
                this.entry(intTimeCostomerEnter);

            } catch (InterruptedException interruptedException) {
                System.out.println("Entry Interrupted");
            }

        }

        super.run();
    }

    public void entry(int intTimeCustomerEnter) {

        int intWichQueue = randomrNumberGenerator.nextInt(2);
        int intWichFood = randomrNumberGenerator.nextInt(3);
        int intTimeToDecide = 1000 + 1000 * randomrNumberGenerator.nextInt(3);

        String stringFoodName = "";

        switch (intWichFood) {
            case 0:
                stringFoodName = "burger";
                break;
            case 1:
                stringFoodName = "sandwich";
                break;
            case 2:
                stringFoodName = "salad";
                break;

        }

        CustomerQueues.enterCustomer(intWichQueue, new Customer(intIDs, intTimeToDecide, stringFoodName));
        System.out.println("Customer #" + intIDs + " enters " + intTimeCustomerEnter / 1000 +
                " seconds later to queue " + (intWichQueue + 1));

    }

    public void end() {
        this.booleanThreadAlive = false;
    }
}

class Attender extends Thread {

    private int intWichQueue;
    private boolean booleanThreadAlive = true;

    public Attender(int _intWichQueue) {
        this.intWichQueue = _intWichQueue;
    }

    @Override
    public void run() {

        int intTimeToDecide = 0;
        Customer customer;

        while (this.booleanThreadAlive) {

            customer = CustomerQueues.attendCustomer(this.intWichQueue);

            if (customer != null) {

                try {
                    // doggi punjab mama is mother you can't change it
                    // you and she have been taken credit for your mistakes
                    // never fuck abandoned currupt dog otherwise always gulami k nam pe dalali
                    this.sleep(customer.intTimeToDesired);
                    this.attend(customer);

                } catch (InterruptedException interruptedException) {
                    System.out.println("Attender Interrupted");
                }

            } else {

                try {

                    this.sleep(500);

                } catch (InterruptedException interruptedException) {

                    System.out.println("Attender Interrupted");
                }
            }

        }

        super.run();
    }

    public void attend(Customer customer) {

        boolean booleanSold = true;
        int intWait = 0;

        while (booleanSold) {

            switch (customer.stringDesiredFood) {
                case "burger":
                    if (FoodStock.cookSellBurger("sell"))
                        booleanSold = false;
                    break;
                case "sandwich":
                    if (FoodStock.cookSellSandwich("sell"))
                        booleanSold = false;
                    break;
                case "salad":
                    if (FoodStock.cookSellSalad("sell"))
                        booleanSold = false;
                    break;
            }

            if (booleanSold) {

                try {

                    this.sleep(1000);
                    intWait++;

                } catch (InterruptedException interruptedException) {
                    System.out.println("Attender Interrupted Wait Food");
                }
            }
        }

        System.out.println("Customer #" + (customer.intId + 1) + " buy a " + customer.stringDesiredFood +
                " and in " + (customer.intTimeToDesired / 1000) + " seconds and wait for food " + intWait + " seconds");
    }

    public void end() {

        this.booleanThreadAlive = false;
    }
}

