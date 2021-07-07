package bridge.cotrollers;

import bridge.devices.AudioDevice;

public class EliteRemoteController extends RegularRemoteController {

    public EliteRemoteController(AudioDevice device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

}
