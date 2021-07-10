package flyweight.cars;

import java.math.BigDecimal;

public class Car {

    private CarType type;

    private String modelName;

    private String color;

    private BigDecimal price;

    public Car(CarType type, String modelName, String color, BigDecimal price) {
        this.type = type;
        this.modelName = modelName;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
