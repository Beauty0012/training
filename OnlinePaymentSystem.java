abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        double fee = amount * 0.02; // 2% transaction fee
        System.out.println("Processing Credit Card payment of $" + (amount + fee) + " (including fee)");
    }
}

class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class OnlinePaymentSystem {
    public static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        System.out.println("Transaction using Credit Card:");
        processTransaction(creditCard, 100);

        System.out.println("\nTransaction using PayPal:");
        processTransaction(payPal, 100);
    }
}
