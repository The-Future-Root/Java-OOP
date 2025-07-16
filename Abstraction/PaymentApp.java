import java.util.*;

// Interface
interface PaymentProcessor {
    void pay(double amount);
}

// UPI Implementation
class UPIPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }
}

// Card Implementation
class CardPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}

// Main class
public class PaymentApp {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select payment method (UPI / CARD): ");
        String choice = in.nextLine().trim().toUpperCase();

        PaymentProcessor payment;  // Upcasting

        if (choice.equals("UPI")) {
            payment = new UPIPayment();
        } else if (choice.equals("CARD")) {
            payment = new CardPayment();
        } else {
            System.out.println("Invalid payment method.");
            in.close();
            return;
        }

        payment.pay(1000.00);
        in.close();
    }
}
