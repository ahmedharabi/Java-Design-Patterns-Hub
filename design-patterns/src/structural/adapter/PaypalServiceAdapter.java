package structural.adapter;

public class PaypalServiceAdapter implements PaymentProcessor {
    private PaypalService payment;
    public PaypalServiceAdapter(PaypalService payment){
        this.payment=payment;
    }

    @Override
    public void makePayment() {
        this.payment.makeTrasaction();
    }
}
