package state.states;

import state.ipod.IPod;

public class TurnedOnState implements State {

    @Override
    public void play(IPod iPod) {
        System.out.println("IPod is ready");
        iPod.setState(new PlayingState());
    }

}
