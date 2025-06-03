public class YoutubeVideo implements Obsah{
    private String nazev;
    private int delka;
    private String jmeno;

    public YoutubeVideo(String nazev, int delka, String jmeno) {
        this.nazev = nazev;
        this.delka = delka;
        this.jmeno = jmeno;
    }

    @Override
    public int getDelka() {
        return delka;
    }

    public String getNazev() {
        return nazev;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String toString(){
        return "Název "+nazev+
                "\nDélka "+delka+
                "\nJméno  "+jmeno;
    }
}