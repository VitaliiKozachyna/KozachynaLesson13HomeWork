public class MainHW20 {
    public static void main(String[] args) {
        MusicStyles band1 = new PopMusic("Depeche Mode");
        MusicStyles band2 = new RockMusic("Iron Maiden");
        MusicStyles band3 = new ClassicMusic("Andrea Bocelli");

        MusicStyles[] array = new MusicStyles[]{band1, band2, band3};

        for (MusicStyles bands: array) {
            bands.playMusic();
        }
    }
}
