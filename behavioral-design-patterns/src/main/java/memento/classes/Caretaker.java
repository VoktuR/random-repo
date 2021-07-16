package memento.classes;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

    private Map<Integer, Memento> mementoMap;

    public Caretaker() {
        mementoMap = new HashMap<>();
    }

    public void saveMemento(Integer key, Memento memento) {
        mementoMap.put(key, memento);
    }

    public Memento getMemento(Integer key) {
        return mementoMap.get(key);
    }

}
