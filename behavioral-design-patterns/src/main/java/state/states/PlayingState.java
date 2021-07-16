package state.states;

import state.ipod.IPod;

public class PlayingState implements State {

    @Override
    public void play(IPod iPod) {
        System.out.println("Music is playing");
        iPod.setState(new PauseState());
    }

}
