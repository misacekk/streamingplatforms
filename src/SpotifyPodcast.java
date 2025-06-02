public class SpotifyPodcast implements Obsah{
    private String nazev;
    private int delka;
    private String moderator;

    @Override
    public int getDelka() {
        return 0;
    }
    public String toString(){
        return "Název"+nazev+
                "\nDélka"+delka+
                "\nModerátor "+moderator;
    }
}