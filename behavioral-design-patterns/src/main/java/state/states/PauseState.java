package state.states;

import state.ipod.IPod;

public class PauseState implements State {

    @Override
    public void play(IPod iPod) {
        System.out.println("Music stopped");
        iPod.setState(new PlayingState());
    }

}
