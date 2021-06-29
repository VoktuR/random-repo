package abstract_factory.factories;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.ModernChair;
import abstract_factory.furniture.ModernSofa;
import abstract_factory.furniture.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

}
