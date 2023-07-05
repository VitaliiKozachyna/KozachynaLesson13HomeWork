public class RockMusic extends MusicStyles{

    String name;

    public RockMusic(String name) {
        this.name = name;
    }
    @Override
    public void playMusic() {
        System.out.println(name + " play Rock");

    }
}
