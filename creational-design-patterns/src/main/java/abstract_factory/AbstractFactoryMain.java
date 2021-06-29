package abstract_factory;

import abstract_factory.factories.FurnitureFactory;
import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        FactoryMaker fm = new FactoryMaker();

        /**
         * Создание Modern фабрики
         */
        FurnitureFactory ff1 = fm.createFactory("Modern");
        Chair c1 = ff1.createChair();
        Sofa s1 = ff1.createSofa();
        c1.sitDown();
        s1.lieDown();

        /**
         * Создание Vintage фабрики
         */
        FurnitureFactory ff2 = fm.createFactory("Vintage");
        Chair c2 = ff2.createChair();
        Sofa s2 = ff2.createSofa();
        c2.sitDown();
        s2.lieDown();

        /**
         * Создание фабрики несуществующего типа
         */
        try {
            FurnitureFactory ff3 = fm.createFactory("Sorry idk type");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }



}
