package abstract_factory.furniture;

public class VintageChair implements Chair {

    @Override
    public void sitDown() {
        System.out.println("Sitting at vintage chair...");
    }

}
