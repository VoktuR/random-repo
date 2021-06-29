package factory_method.factory;

import factory_method.vehicles.Bus;
import factory_method.vehicles.Vehicle;

public class BusRacingTrack extends RacingTrack {

    @Override
    public Vehicle takeVehicle() {
        return new Bus();
    }

}
