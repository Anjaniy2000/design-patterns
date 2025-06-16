package creational.builder;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        User jay = new User.
                Builder()
                .setId(UUID.randomUUID())
                .setUsername("Jay007")
                .setPassword("Jay@12345")
                .build();

        System.out.println(jay);

        User adam = new User
                .Builder()
                .setId(UUID.randomUUID())
                .setUsername("Adam007")
                .setPassword("Adam@12345")
                .setEmail("adam01adam@gmail.com")
                .setDateOfBirth("1998-02-03")
                .setCardNo("1234-1234-1234-1234")
                .build();

        System.out.println(adam);
    }
}
