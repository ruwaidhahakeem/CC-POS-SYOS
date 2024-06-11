package strategyForPayments;

public class CreditCardOption implements PaymentStrategy {
    private String cardNo;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CreditCardOption(String cardNo, String cardHolderName, String expiryDate, String cvv) {
        this.cardNo = cardNo;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with Credit Card");
    }
}
