package Example_Of_SOLID_Principles;

public class InterfaceSegregation {

    public static void main(String[] args) {

        MakeQualityFactory makeQualityFactoryX = new MakeQualityFactory();
        SodaFactory sodaFactoryX = new SodaFactory();
        CarFactory carFactoryX = new CarFactory();

    }
}

class MakeQualityFactory implements ProductionDepartment, DeliveryDepartment {

    public MakeQualityFactory() {;}

    @Override
    public void logistics() {
        ;
    }

    @Override
    public void distribution() {
        ;
    }

    @Override
    public void manufacture() {
        ;
    }

    @Override
    public void transformRawMaterial() {
        ;
    }
}

class SodaFactory implements ProductionDepartment, AdministrativeDepartment, InvestigationDepartment {

    public SodaFactory() {;}

    @Override
    public void administration() {
        ;
    }

    @Override
    public void accountancy() {
        ;
    }

    @Override
    public void createNewProduct() {
        ;
    }

    @Override
    public void costReduction() {
        ;
    }

    @Override
    public void manufacture() {
        ;
    }

    @Override
    public void transformRawMaterial() {
        ;
    }
}


// Bad Implementation
interface Factory {

    public void administration();
    public void manufacture();
    public void accountancy();
    public void transformRawMaterial();
    public void createNewProduct();
    public void costReduction();
    public void logistics();
    public void distribution();

}

class CarFactory implements ProductionDepartment, InvestigationDepartment {

    public CarFactory() {;}

    @Override
    public void createNewProduct() {
        ;
    }

    @Override
    public void costReduction() {
        ;
    }

    @Override
    public void manufacture() {
        ;
    }

    @Override
    public void transformRawMaterial() {
        ;
    }
}

// Better Implimentation applying Interface Segregation
// Segregate Factory interface on Department interfaces
interface AdministrativeDepartment {

    public void administration();
    public void accountancy();

}

interface ProductionDepartment {

    public void manufacture();
    public void transformRawMaterial();

}

interface InvestigationDepartment {

    public void createNewProduct();
    public void costReduction();

}

interface DeliveryDepartment {

    public void logistics();
    public void distribution();


}







