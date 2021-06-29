package factory_method.vehicles;

public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void drive() {
        System.out.println("Bus on its way to finish...");
    }

    @Override
    public void stop() {
        System.out.println("Bus out of fuel. Need to stop.");
    }

}
