public class YoutubeVideo implements Obsah{
    private String nazev;
    private int delka;
    private String jmeno;

    @Override
    public int getDelka() {
        return 0;
    }
    public String toString(){
        return "Název"+nazev+
                "\nDélka"+delka+
                "\nJméno "+jmeno;
    }
}