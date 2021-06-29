package factory_method.factory;

import factory_method.vehicles.Vehicle;

public abstract class RacingTrack {

    public void startRace() {
        Vehicle vehicle = takeVehicle();
        vehicle.race();
    }

    public abstract Vehicle takeVehicle();

}
