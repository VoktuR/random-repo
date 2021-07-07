package bridge;

import bridge.cotrollers.EliteRemoteController;
import bridge.devices.TV;

public class BridgeMain {

    public static void main(String[] args) {
        TV tv  = new TV();
        EliteRemoteController controller = new EliteRemoteController(tv);

        controller.power();
        System.out.println(tv.isTurnedOn());
        controller.volumeUp();
        controller.volumeUp();
        System.out.println(tv.getVolume());
        controller.volumeDown();
        System.out.println(tv.getVolume());
        controller.mute();
        System.out.println(tv.getVolume());
        controller.power();
        System.out.println(tv.isTurnedOn());
    }

}
