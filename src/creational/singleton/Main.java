package creational.singleton;

import creational.singleton.bill_pugh.AuthServiceWithBillPugh;
import creational.singleton.thread_safe.AuthServiceThreadSafe;
import creational.singleton.thread_safe_optimal.AuthServiceThreadSafeOptimal;

public class Main {
    public static void main(String[] args) {
        AuthService service = AuthService.getInstance();
        service.authenticate();

        AuthServiceThreadSafe serviceThreadSafe = AuthServiceThreadSafe.getInstance();
        serviceThreadSafe.authenticate();

        AuthServiceThreadSafeOptimal serviceThreadSafeOptimal = AuthServiceThreadSafeOptimal.getInstance();
        serviceThreadSafeOptimal.authenticate();

        AuthServiceWithBillPugh serviceWithBillPugh = AuthServiceWithBillPugh.getInstance();
        serviceWithBillPugh.authenticate();
    }
}
