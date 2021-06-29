package factory_method;

import abstract_factory.factories.ModernFurnitureFactory;
import abstract_factory.factories.VintageFurnitureFactory;
import factory_method.factory.BusRacingTrack;
import factory_method.factory.CarRacingTrack;
import factory_method.factory.RacingTrack;
import factory_method.factory.TruckRacingTrack;

public class TrackMaker {

    private RacingTrack rt;

    public RacingTrack createTrack(String trackType) {
        if (trackType.equalsIgnoreCase("Car")) {
            rt = new CarRacingTrack();
        } else if (trackType.equalsIgnoreCase("Truck")) {
            rt = new TruckRacingTrack();
        } else if (trackType.equalsIgnoreCase("Bus")) {
            rt = new BusRacingTrack();
        } else {
            throw new RuntimeException("That track type not allowed");
        } return rt;
    }

}
