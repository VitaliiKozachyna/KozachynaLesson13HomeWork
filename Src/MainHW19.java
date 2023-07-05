public class MainHW19 {
    public static void main(String[] args) {
        Smartphones android1 = new Androids();
        Smartphones iPhone1 = new IPhones();
        LinuxOS android2 = new Androids();
        Ios iPhone2 = new IPhones();

        android1.call();
        android1.sms();
        android1.internet();
        android2.runLinux();

        iPhone1.call();
        iPhone1.sms();
        iPhone1.internet();
        iPhone2.runIos();
    }
}
