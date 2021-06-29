package abstract_factory.factories;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;
import abstract_factory.furniture.VintageChair;
import abstract_factory.furniture.VintageSofa;

public class VintageFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

}
