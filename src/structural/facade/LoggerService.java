package structural.facade;

import creational.builder.User;

public class LoggerService {
    public void logBooking(User user) {
        System.out.println("Trip booked for " + user.getUsername());
    }
}
