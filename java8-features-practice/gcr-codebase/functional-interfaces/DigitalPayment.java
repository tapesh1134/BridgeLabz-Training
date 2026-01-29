
interface Payment {

    void pay();
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Pay using UPI");
    }
}

class Card implements Payment {

    public void pay() {
        System.out.println("Pay using card");
    }
}

public class DigitalPayment {

    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new Card();

        upi.pay();
        card.pay();
    }
}
