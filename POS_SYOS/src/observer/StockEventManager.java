package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockEventManager {
    private Map<String, List<ConcreteEventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, ConcreteEventListener listener) {
        this.listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public void unsubscribe(String eventType, ConcreteEventListener listener) {
        List<ConcreteEventListener> users = listeners.get(eventType);
        if (users != null) {
            users.remove(listener);
        }
    }

    public void notification(String eventType, String data) {
        List<ConcreteEventListener> users = listeners.get(eventType);
        if (users != null) {
            for (ConcreteEventListener listener : users) {
                listener.update(eventType, data);
            }
        }
    }
}
