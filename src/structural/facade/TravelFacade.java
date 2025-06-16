package structural.facade;

import creational.builder.User;

public class TravelFacade {
    private final ValidatorService validatorService = new ValidatorService();
    private final BookingCoordinator bookingCoordinator = new BookingCoordinator();
    private final NotificationService notificationService = new NotificationService();
    private final LoggerService loggerService = new LoggerService();

    public void bookTrip(User user) {
        validatorService.validate(user);
        bookingCoordinator.bookAll();
        notificationService.sendConfirmation(user);
        loggerService.logBooking(user);
    }
}
