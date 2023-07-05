public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Call from Android");
    }

    @Override
    public void sms() {
        System.out.println("Sms from Android");
    }

    @Override
    public void internet() {
        System.out.println("Use internet on Android");
    }

    @Override
    public void runLinux() {
        System.out.println("Run Linux on Android");
    }
}
