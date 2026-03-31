
interface PaymentProcessor {

    void paymentProcess(double amount);

    default void refund(double amount) {
        System.out.println("Refund is not supported by this payment provider");
    }
}

class PayTM implements PaymentProcessor {

    @Override
    public void paymentProcess(double amount) {
        System.out.println("Pay using PayTM: $" + amount);
    }
}

class PhonePe implements PaymentProcessor {

    @Override
    public void paymentProcess(double amount) {
        System.out.println("Pay using PhonePe: $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund monitored by PhonePe: $" + amount);
    }
}

public class PaymentApp {

    public static void main(String[] args) {
        PaymentProcessor paytm = new PayTM();
        PaymentProcessor phonepe = new PhonePe();

        paytm.paymentProcess(1000.0);
        phonepe.paymentProcess(2000.0);

        paytm.refund(1000.0);
        phonepe.refund(2000.0);
    }
}
