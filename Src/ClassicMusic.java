public class ClassicMusic extends MusicStyles{

    String name;

    public ClassicMusic(String name) {
        this.name = name;
    }

    @Override
    public void playMusic() {
        System.out.println(name + " play Classic music");
    }
}
