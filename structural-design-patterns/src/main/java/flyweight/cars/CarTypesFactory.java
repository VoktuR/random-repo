package flyweight.cars;

import java.util.HashMap;
import java.util.Map;

public class CarTypesFactory {

    private static Map<String, CarType> carTypes = new HashMap<>();

    public static CarType getCarType(String name, int seats, int wheels, boolean roof) {
        CarType type = carTypes.get(name);
        if (type == null) {
            type = new CarType(name, seats, wheels, roof);
            carTypes.put(name, type);
            System.out.println("Type " + name + " was added to flyweight cache");
        }
        return type;
    }

}
