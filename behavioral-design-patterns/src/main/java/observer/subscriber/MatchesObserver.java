package observer.subscriber;

public class MatchesObserver implements Observer {

    private String observerName;
    private String team1;
    private String team2;
    private int score1;
    private int score2;

    public MatchesObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String team1, String team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        showMatchInfo();
    }

    private void showMatchInfo() {
        System.out.printf("Match: %s - %s; Score %d - %d, info by %s\n", team1, team2, score1, score2, observerName);
    }

}
