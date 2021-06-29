package abstract_factory.factories;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

}
