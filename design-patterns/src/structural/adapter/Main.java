package structural.adapter;

public class Main {
    public static void main(String[] args){
        PaypalService paypal=new PaypalService();
        PaymentProcessor p1=new PaypalServiceAdapter(paypal);
        ApplePayService applePay=new ApplePayService();
        PaymentProcessor p2=new ApplePayAdapter(applePay);

        p1.makePayment();
        p2.makePayment();

    }
    public static void makePayment (PaymentProcessor p){
        p.makePayment();
    }
}
