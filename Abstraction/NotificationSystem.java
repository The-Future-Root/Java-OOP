import java.util.*;

interface NotificationService {
    void send(String message);
}

class EmailNotification implements NotificationService {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements NotificationService {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select notification type (SMS / Email): ");
        String choice = in.nextLine().trim().toUpperCase();

        System.out.println("Enter your message: ");
        String message = in.nextLine();

        NotificationService notification;

        if (choice.equals("SMS")) {
            notification = new SMSNotification();
        } else if (choice.equals("EMAIL")) {
            notification = new EmailNotification();
        } else {
            System.out.println("Invalid choice.");
            in.close();
            return;
        }

        notification.send(message);
        in.close();
    }
}
