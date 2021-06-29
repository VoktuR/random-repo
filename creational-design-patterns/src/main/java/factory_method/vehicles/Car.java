package factory_method.vehicles;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void drive() {
        System.out.println("Car on its way to finish...");
    }

    @Override
    public void stop() {
        System.out.println("Car out of fuel. Need to stop.");
    }
}
