package state.ipod;

import state.states.State;
import state.states.TurnedOnState;

public class IPod {

    private State state;

    public IPod() {
        state = new TurnedOnState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton() {
        state.play(this);
    }

}
