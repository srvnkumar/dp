package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        SurroundedSound sound = new SurroundedSound();
        Projector projector = new Projector();
        HomeTheaterFacade facade = new HomeTheaterFacade(dvd,projector,sound);
        facade.watchMovie("Interceptor");
        facade.endMovie();
    }
}