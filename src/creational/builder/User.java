package creational.builder;

import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String dateOfBirth;
    private String cardNo;

    public User(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.dateOfBirth = builder.dateOfBirth;
        this.cardNo = builder.cardNo;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCardNo() {
        return cardNo;
    }

    public static class Builder{
        private UUID id;
        private String username;
        private String password;
        private String email;
        private String dateOfBirth;
        private String cardNo;

        public Builder setId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setCardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}

