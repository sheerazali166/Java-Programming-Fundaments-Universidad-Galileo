package Classes_Objects_And_Methods.Screencast_Of_Classes_Objects_And_Methods;

public class Main {

    public static void main(String[] args) {

        Human humanJennie = new Human("Jennie", "Smith", 'F');
        humanJennie.setBirthDate(1987, 1, 22); // January 22th, 1987

        System.out.println(humanJennie.getFullName() + " is " + humanJennie.getAge() + " years old");

        Human humanJohn = new Human("John", "Brown", 'M');
        humanJohn.setBirthDate(1986, 12, 8); // December 08th, 1986
        System.out.println(humanJohn.getFullName() + " is " + humanJohn.getAge() + " years old");

        humanJennie.addPartner(humanJohn);

        System.out.println(humanJennie.getFullName() + "'s partner is " + humanJennie.getPartnerName());
        System.out.println(humanJohn.getFullName() + "'s partner is " + humanJohn.getPartnerName());



    }
}
