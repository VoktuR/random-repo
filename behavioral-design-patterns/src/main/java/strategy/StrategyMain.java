package strategy;

import strategy.navigator.Navigator;
import strategy.strategies.OnBicycleStrategy;
import strategy.strategies.OnCarStrategy;
import strategy.strategies.OnLegsStrategy;

public class StrategyMain {

    public static void main(String[] args) {

        Navigator navigator = new Navigator(60);
        System.out.println(navigator.makeRoute(new OnLegsStrategy()));
        System.out.println(navigator.makeRoute(new OnCarStrategy()));
        System.out.println(navigator.makeRoute(new OnBicycleStrategy()));

    }

}
