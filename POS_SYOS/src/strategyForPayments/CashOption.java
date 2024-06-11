package strategyForPayments;

public class CashOption implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash");
    }
}
