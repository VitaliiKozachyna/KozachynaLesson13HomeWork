public class IPhones implements Smartphones, Ios {
    @Override
    public void runIos() {
        System.out.println("Run iOS on iPhone");
    }

    @Override
    public void call() {
        System.out.println("Call from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sms from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Use internet on iPhone");
    }
}
