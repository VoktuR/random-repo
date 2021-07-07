package bridge.devices;

public interface AudioDevice {

    boolean isTurnedOn();

    void turnOn();

    void turnOff();

    int getVolume();

    void setVolume(int volume);
}
