package strategyForPayments;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    //here's where the logic to process tha payment is
    public void processPayment(double amount){
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        }else {
            throw new IllegalStateException("Payment Method hasn't been set");
        }
    }
}
