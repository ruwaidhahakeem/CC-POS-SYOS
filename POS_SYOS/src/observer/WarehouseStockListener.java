package observer;

public class WarehouseStockListener implements ConcreteEventListener {
    @Override
    public void update(String eventType, String data) {
        if (eventType.equals("restocking")) {
        System.out.println("Restocking warehouse item: " + data);
        // Add logic to update the warehouse stock
    }
    }
}
