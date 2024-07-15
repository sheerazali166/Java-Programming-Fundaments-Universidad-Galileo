package Example_Of_SOLID_Principles;

import java.util.ArrayList;

public class LiskovSubstitution {

    public static void main(String[] args) throws Exception{

        PetShopInfoCenter.addProduct(new Dog(180, 100, 15,
                "If You Adopt Supplies are Free"));

        PetShopInfoCenter.addProduct(new Fish(15, 15));

        System.out.println(PetShopInfoCenter.generateCatalogue());

    }

}

final class PetShopInfoCenter {

    private static ArrayList<Animal> animalArrayListProductCatalogue = new ArrayList<>();

    public PetShopInfoCenter() {;}

    public static void addProduct(Animal animal) {
        animalArrayListProductCatalogue.add(animal);
    }

    public static String generateCatalogue() {

        String catalogue = "";

        for (Animal animal: animalArrayListProductCatalogue) {

            catalogue +=  animal.getName() + ":\n\t" +
                    animal.getCompletePrice() + "\n\t" +
                    animal.getExtraSupplies() + "\n\t" +
                    animal.getBuyOptions() + "\n\t";

        }

        return catalogue;
    }

}

// Father Class
abstract class Animal {

    private String name;
    private int basePrice, suppliesPrice;


    public Animal(String _name, int _basePrice, int _suppliesPrice) {
        this.name = _name;
        this.basePrice = _basePrice;
        this.suppliesPrice = _suppliesPrice;
    }

    public String getName() {
        return name;
    }

    public String getCompletePrice() {

        return "Animal Price: $" + this.basePrice + ".00 Supplies Price: $" + this.suppliesPrice +
                ".00\n\tTotal Price: $" + (this.basePrice + this.suppliesPrice) + ".00";
    }

    public abstract String getExtraSupplies();
    public abstract String getBuyOptions();

}

// Child Class
class Dog extends Animal {

    private String otherRelatedData;
    private int obligatorySuppliesPrice, optionalSuppliesPrice;

    public Dog(int basePrice, int _obligatorySuppliesPrice, int _optionalSuppliesPrice, String _otherRelatedData) {

        super("Dog", basePrice, _obligatorySuppliesPrice + _optionalSuppliesPrice);
        this.otherRelatedData = _otherRelatedData;
        this.obligatorySuppliesPrice = _obligatorySuppliesPrice;
        this.optionalSuppliesPrice = _optionalSuppliesPrice;

    }

    @Override
    public String getExtraSupplies() {
        return "\tObligatory: Vaccines, Food 50kg\t($" + this.obligatorySuppliesPrice +
                ".00)\n\t\tOptional: dog collar & harness\t($" + this.optionalSuppliesPrice + ".00)";
    };

    @Override
    public String getBuyOptions() {
        return "Breeds: Golden Retriever, Schnauzer husky\n\t" + this.otherRelatedData;
    };
}

// Child Class
class Fish extends Animal {

    public Fish(int basePrice, int suppliesPrice) {
        super("Fish", basePrice, suppliesPrice);
    }

    @Override
    public String getExtraSupplies() {
        return "\tFishbowl, Food, Fungicide Drops";
    }

    @Override
    public String getBuyOptions() {
        return "Breeds: Beta, Koi, Angel\n\t";
    }
}



