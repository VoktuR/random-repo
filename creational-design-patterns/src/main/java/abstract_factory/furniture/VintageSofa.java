package abstract_factory.furniture;

public class VintageSofa implements Sofa {

    @Override
    public void lieDown() {
        System.out.println("Lying at vintage sofa...");
    }

}
