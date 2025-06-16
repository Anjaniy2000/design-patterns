package structural.facade;

import creational.builder.User;

public class NotificationService {
    public void sendConfirmation(User user) {
        System.out.println("Sending confirmation email to " + user.getEmail());
    }
}
