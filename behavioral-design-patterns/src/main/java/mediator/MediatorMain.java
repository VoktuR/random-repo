package mediator;

import mediator.clients.Engine;
import mediator.clients.EngineStarter;
import mediator.key.CarKeyMediator;

public class MediatorMain {

    public static void main(String[] args) {
        EngineStarter starter = new EngineStarter(new CarKeyMediator(new Engine()));
        starter.makeKeyTurn();
        starter.makeKeyTurn();
    }

}
