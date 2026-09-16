package Cap02;

public class Episode {
    int seriesNumber;
    int episodeNumber;

    void play(){}
    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext(){
        System.out.println("Loading next episode...");
    }
}

class EpisodeTestDrive {
    public static void main(String[] args){

        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
    }
}
