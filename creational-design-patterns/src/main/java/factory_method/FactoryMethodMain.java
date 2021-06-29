package factory_method;

import factory_method.factory.RacingTrack;

public class FactoryMethodMain {

    public static void main(String[] args) {

        TrackMaker tm = new TrackMaker();

        /**
         * Создание различных фабричных методов для проверки
         */
        RacingTrack rt1 = tm.createTrack("Car");
        rt1.startRace();

        RacingTrack rt2 = tm.createTrack("Truck");
        rt2.startRace();

        RacingTrack rt3 = tm.createTrack("Bus");
        rt3.startRace();

        try {
            RacingTrack rt4 = tm.createTrack("Plane");
            rt4.startRace();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

}
