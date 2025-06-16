package structural.facade;

import creational.builder.User;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        User adam = new User
                .Builder()
                .setId(UUID.randomUUID())
                .setUsername("Adam007")
                .setPassword("Adam@12345")
                .setEmail("adam01adam@gmail.com")
                .setDateOfBirth("1998-02-03")
                .setCardNo("1234-1234-1234-1234")
                .build();

        travelFacade.bookTrip(adam);
    }
}
