package observer.publisher;

import observer.subscriber.Observer;

import java.util.HashSet;
import java.util.Set;

public class SoccerLeague implements Observable {

    private Set<Observer> observers;

    private String team1;
    private String team2;
    private int score1;
    private int score2;

    public SoccerLeague() {
        observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(team1, team2, score1, score2);
        }
    }

    public void setNewInfo(String team1, String team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        notifyObservers();
    }

}
