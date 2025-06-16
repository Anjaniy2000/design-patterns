package creational.singleton.bill_pugh;

public class AuthServiceWithBillPugh {
    private AuthServiceWithBillPugh(){}
    // Inner static class responsible for holding Singleton instance
    private static class Holder {
        private static final AuthServiceWithBillPugh INSTANCE = new AuthServiceWithBillPugh();
    }

    public static AuthServiceWithBillPugh getInstance() {
        return Holder.INSTANCE;
    }

    public void authenticate() {
        System.out.println("Authenticating.....");
    }
}
