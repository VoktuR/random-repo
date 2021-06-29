package abstract_factory.furniture;

public class ModernChair implements Chair {

    @Override
    public void sitDown() {
        System.out.println("Sitting at modern chair...");
    }
}
