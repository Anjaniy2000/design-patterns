package creational.singleton;

public class AuthService {
    private static AuthService service;

    private AuthService(){}

    public static AuthService getInstance() {
        if(service == null) {
            return new AuthService();
        }
        return service;
    }

    public void authenticate() {
        System.out.println("Authenticating.....");
    }
}
