package strategy.strategies;

public class OnCarStrategy implements RoutingStrategy {

    @Override
    public float calcTime(float distance) {
        return distance / 60;
    }

}
