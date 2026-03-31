
import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Observer> observers = new ArrayList<>();

    void subscribe(Observer o) {
        observers.add(o);
    }

    void notifyObservers(String msg) {
        observers.forEach(o -> o.update(msg));
    }
}
