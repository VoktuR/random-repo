package flyweight.cars;

public class CarType {

    private String typeName;

    private int seats;

    private int wheels;

    private boolean roof;

    public CarType(String typeName, int seats, int wheels, boolean roof) {
        this.typeName = typeName;
        this.seats = seats;
        this.wheels = wheels;
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "typeName='" + typeName + '\'' +
                ", seats=" + seats +
                ", wheels=" + wheels +
                ", roof=" + roof +
                '}';
    }
}
