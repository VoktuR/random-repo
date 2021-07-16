package memento;

import memento.classes.Caretaker;
import memento.classes.Originator;

public class MementoMain {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("A");
        System.out.println(originator);
        caretaker.saveMemento(1, originator.saveState());
        originator.setState("D");
        System.out.println(originator);
        caretaker.saveMemento(2, originator.saveState());
        originator.setState("I");
        System.out.println(originator);
        originator.restoreState(caretaker.getMemento(2));
        System.out.println(originator);
        originator.restoreState(caretaker.getMemento(1));
        System.out.println(originator);

    }

}
