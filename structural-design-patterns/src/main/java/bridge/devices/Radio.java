package bridge.devices;

public class Radio implements AudioDevice {

    boolean isEnabled = false;
    int volume = 0;

    @Override
    public boolean isTurnedOn() {
        return isEnabled;
    }

    @Override
    public void turnOn() {
        isEnabled = true;
    }

    @Override
    public void turnOff() {
        isEnabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

}
