package structural.adapter;

public class ApplePayAdapter implements PaymentProcessor{
    private ApplePayService applePay;
    public ApplePayAdapter(ApplePayService applePay){
        this.applePay=applePay;
    }

    @Override
    public void makePayment() {
        this.applePay.applePay();
    }
}
