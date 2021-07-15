package mediator.clients;

import mediator.key.CarKeyMediator;

public class EngineStarter {

    private CarKeyMediator mediator;

    public EngineStarter(CarKeyMediator mediator) {
        this.mediator = mediator;
    }

    public void makeKeyTurn() {
        mediator.makeTurn();
    }

}
