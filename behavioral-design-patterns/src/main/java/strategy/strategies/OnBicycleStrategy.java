package strategy.strategies;

public class OnBicycleStrategy implements RoutingStrategy {

    @Override
    public float calcTime(float distance) {
        return distance / 15;
    }

}
