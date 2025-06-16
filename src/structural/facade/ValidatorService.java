package structural.facade;

import creational.builder.User;

public class ValidatorService {
    public void validate(User user) {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Invalid user email");
        }
        if (user.getCardNo().length() != 19) {
            throw new IllegalArgumentException("Invalid card number");
        }
    }
}

