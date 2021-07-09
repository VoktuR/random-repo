package facade.facade;

import facade.parts.*;

public class Computer {

    private PowerSupplyUnit powerSupplyUnit;
    private CPU cpu;
    private Memory memory;
    private Monitor monitor;
    private HardDisk hardDisk;
    private Windows windows;

    private String username;

    public Computer(String username) {
        this.username = username;
        this.powerSupplyUnit = new PowerSupplyUnit();
        this.cpu = new CPU();
        this.monitor = new Monitor();
        this.memory = new Memory();
    }

    public void startComputer() {
        powerSupplyUnit.turnOn();
        cpu.startCpu();
        monitor.showImage();
        hardDisk = memory.read();
        windows = hardDisk.loadUefiWindows();
        windows.greetings(username);
    }

}
