package creational.singleton.thread_safe_optimal;

//Double-Checked Locking + volatile
public class AuthServiceThreadSafeOptimal {
    private static volatile AuthServiceThreadSafeOptimal service;

    private AuthServiceThreadSafeOptimal(){}

    public static AuthServiceThreadSafeOptimal getInstance() {
        if (service == null) {
            synchronized (AuthServiceThreadSafeOptimal.class) {
                if (service == null) {
                    service = new AuthServiceThreadSafeOptimal();
                }
            }
        }
        return service;
    }

    public void authenticate() {
        System.out.println("Authenticating.....");
    }
}
