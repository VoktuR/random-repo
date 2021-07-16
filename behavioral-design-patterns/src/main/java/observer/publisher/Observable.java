package observer.publisher;

import observer.subscriber.Observer;

public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
