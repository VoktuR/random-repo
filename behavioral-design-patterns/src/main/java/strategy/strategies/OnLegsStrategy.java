package strategy.strategies;

public class OnLegsStrategy implements RoutingStrategy {

    @Override
    public float calcTime(float distance) {
        return distance / 5;
    }

}
