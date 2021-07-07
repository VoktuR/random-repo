package bridge.cotrollers;

import bridge.devices.AudioDevice;

public class RegularRemoteController implements RemoteController {

    protected AudioDevice device;

    public RegularRemoteController(AudioDevice device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isTurnedOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        if (device.getVolume() >= 0) {
            device.setVolume(device.getVolume() + 1);
        }
    }

    @Override
    public void volumeDown() {
        if (device.getVolume() > 0) {
            device.setVolume(device.getVolume() - 1);
        }
    }

}
