public class PopMusic extends MusicStyles{

    String name;

    public PopMusic(String name) {
        this.name = name;
    }
    @Override
    public void playMusic() {
        System.out.println(name + " play Pop");
    }
}
