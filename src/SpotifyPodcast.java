public class SpotifyPodcast implements Obsah{
    private String nazev;
    private int delka;
    private String moderator;

    public SpotifyPodcast(String nazev, int delka, String moderator) {
        this.nazev = nazev;
        this.delka = delka;
        this.moderator = moderator;
    }

    @Override
    public int getDelka() {
        return delka;
    }

    public String getNazev() {
        return nazev;
    }

    public String getModerator() {
        return moderator;
    }

    public String toString(){
        return "Název "+nazev+
                "\nDélka "+delka+
                "\nModerátor "+moderator;
    }
}