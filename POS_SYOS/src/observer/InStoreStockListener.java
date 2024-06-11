package observer;

public class InStoreStockListener implements ConcreteEventListener {
    @Override
    public void update(String eventType, String data) {
        if (eventType.equals("restocking")) {
        System.out.println("Restocking in-store item: " + data);
        // Add logic to update the in-store stock
    }
    }
}
