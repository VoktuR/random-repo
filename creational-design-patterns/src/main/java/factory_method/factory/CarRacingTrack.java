package factory_method.factory;

import factory_method.vehicles.Car;
import factory_method.vehicles.Vehicle;

public class CarRacingTrack extends RacingTrack {

    @Override
    public Vehicle takeVehicle() {
        return new Car();
    }

}
