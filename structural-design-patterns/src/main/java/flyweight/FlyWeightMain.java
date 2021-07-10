package flyweight;

import flyweight.cars.Car;
import flyweight.cars.CarType;
import flyweight.cars.CarTypesFactory;

import java.math.BigDecimal;

public class FlyWeightMain {

    public static void main(String[] args) {

        CarType carType = CarTypesFactory.getCarType("MiniTruck", 6, 6, true);
        Car miniTruck = new Car(carType, "mini-truck-1", "blue", new BigDecimal(30000));
        System.out.println(miniTruck);

    }

}
