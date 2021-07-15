package mediator.key;

import mediator.clients.Engine;

public class CarKeyMediator implements KeyMediator {

    private Engine engine;

    public CarKeyMediator(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void makeTurn() {
        if (engine.isStarted()) {
            engine.stop();
        } else {
            engine.start();
        }
    }

}
