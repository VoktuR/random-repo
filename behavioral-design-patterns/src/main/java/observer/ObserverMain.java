package observer;

import observer.publisher.SoccerLeague;
import observer.subscriber.MatchesObserver;

public class ObserverMain {

    public static void main(String[] args) {

        SoccerLeague league = new SoccerLeague();
        MatchesObserver observer1 = new MatchesObserver("First channel");
        MatchesObserver observer2 = new MatchesObserver("Second channel");

        league.registerObserver(observer1);
        league.registerObserver(observer2);

        league.setNewInfo("England", "Denmark", 2 , 1);

        league.removeObserver(observer2);

        league.setNewInfo("Italy", "England", 2 , 1);

    }

}
