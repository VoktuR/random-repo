package strategy.navigator;

import strategy.strategies.RoutingStrategy;

public class Navigator {

    private float distance;

    public Navigator(float distance) {
        this.distance = distance;
    }

    public float makeRoute(RoutingStrategy strategy) {
        return strategy.calcTime(distance);
    }

}
