package abstract_factory;

import abstract_factory.factories.FurnitureFactory;
import abstract_factory.factories.ModernFurnitureFactory;
import abstract_factory.factories.VintageFurnitureFactory;

public class FactoryMaker {

    private FurnitureFactory ff;

    public FurnitureFactory createFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("Modern")) {
            ff = new ModernFurnitureFactory();
        } else if (factoryType.equalsIgnoreCase("Vintage")) {
            ff = new VintageFurnitureFactory();
        } else {
            throw new RuntimeException("That factory type not allowed");
        } return ff;
    }

}
