package com.java.oops.pillars.inheritance.multiple;

public interface Spotify {
    void play_spotify();
}
interface WynkMusic {
    void play_wynk_music();
}
interface Gaana{
    void play_gaana();
}
class MusicPlayers implements Spotify, WynkMusic, Gaana{
    @Override
    public void play_spotify() {
        System.out.println("Playing Music From Spotify..!!");
    }
    @Override
    public void play_wynk_music() {
        System.out.println("Playing Music From Wynk..!!");
    }
    @Override
    public void play_gaana() {
        System.out.println("Playing Music From Gaana..!!");
    }
}
class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MusicPlayers musicPlayers = new MusicPlayers();
        musicPlayers.play_spotify();
        musicPlayers.play_wynk_music();
        musicPlayers.play_gaana();
    }
}
