package factory_method.vehicles;

public interface Vehicle {

    default void race() {
        start();
        drive();
        stop();
    }

    void start();

    void drive();

    void stop();

}
