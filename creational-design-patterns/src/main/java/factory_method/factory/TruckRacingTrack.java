package factory_method.factory;

import factory_method.vehicles.Truck;
import factory_method.vehicles.Vehicle;

public class TruckRacingTrack extends RacingTrack {

    @Override
    public Vehicle takeVehicle() {
        return new Truck();
    }

}
