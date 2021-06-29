package factory_method.vehicles;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void drive() {
        System.out.println("Truck on its way to finish...");
    }

    @Override
    public void stop() {
        System.out.println("Truck out of fuel. Need to stop.");
    }

}
