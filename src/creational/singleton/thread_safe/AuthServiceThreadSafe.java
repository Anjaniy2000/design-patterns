package creational.singleton.thread_safe;

public class AuthServiceThreadSafe {
    private static AuthServiceThreadSafe service;

    private AuthServiceThreadSafe(){}

    public static synchronized AuthServiceThreadSafe getInstance() {
        if(service == null) {
            return new AuthServiceThreadSafe();
        }
        return service;
    }

    public void authenticate() {
        System.out.println("Authenticating.....");
    }
}
