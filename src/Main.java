import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
ArrayList <Obsah> obsah = new ArrayList<Obsah>();

boolean cycle = true;
while (cycle) {
    System.out.println("Co chceš dělat?");
    System.out.println("1. Přidat obsah.");
    System.out.println("2. Vypsat všechny youtube videa.");
    System.out.println("3. Vypsat délku nejkratšího obsahu.");
    System.out.println("4. Konec programu.");
    int vyber = sc.nextInt();
    sc.nextLine();

    switch (vyber) {
        case 1:
            System.out.println("Youtube nebo Spotify(1-2).");
            int c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    System.out.println("Zadej název videa.");
                    String nazev = sc.nextLine();
                    System.out.println("Zadej délku videa.");
                    int delka = sc.nextInt();
                    System.out.println("Zadej jméno autora.");
                    String jmenoAutora = sc.nextLine();
                    sc.nextLine();
                    YoutubeVideo youtubeVideo = new YoutubeVideo(nazev,delka,jmenoAutora);
                    obsah.add(youtubeVideo);
                    break;
                case 2:
                    System.out.println("Zadej název songy.");
                    String nazev1 = sc.nextLine();
                    System.out.println("Zadej délku songy.");
                    int delka1 = sc.nextInt();
                    System.out.println("Zadej jméno moderátora.");
                    String jmenoModeratora = sc.nextLine();
                    sc.nextLine();
                    SpotifyPodcast spotifyPodcast = new SpotifyPodcast(nazev1,delka1,jmenoModeratora);
                    obsah.add(spotifyPodcast);
            }
        case 2:
            System.out.println("Všechna youtube videa.");
            for (int i = 0; i < obsah.size(); i++) {
                System.out.println(obsah.get(i).toString());
            }
            break;
        case 3:
            System.out.println("Délka nejkratšího obsahu.");
            double nejkratsi = Double.MAX_VALUE;
            for (int i = 0; i < obsah.size(); i++) {
                if (obsah.get(i) instanceof YoutubeVideo) {
                    if(((YoutubeVideo) obsah.get(i)).getDelka()<nejkratsi){
                        nejkratsi = ((YoutubeVideo) obsah.get(i)).getDelka();
                    }
                }
            }
            System.out.println("Nejkratší délka obsahu: "+nejkratsi);
            break;
        case 4:
            System.out.println("KONEC");
            cycle = false;
    }


}

    }
}