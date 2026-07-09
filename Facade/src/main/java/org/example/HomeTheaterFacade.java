package org.example;

public class HomeTheaterFacade {
    private final DVDPlayer dvd;
    private final Projector projector;
    private final SurroundedSound sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SurroundedSound sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }
    public void watchMovie(String movie){
        System.out.println("Get ready to watch the movie");
        projector.on();
        projector.wideScreenMode();
        sound.on();
        sound.setVolume(10);
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie(){
        System.out.println("shutting down the home theater");
        dvd.off();
        sound.off();
        projector.off();
    }
}
