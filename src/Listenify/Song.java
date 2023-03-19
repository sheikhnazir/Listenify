package Listenify;

public class Song {
    String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    public String toString() {
        return "Song{" +
                "name='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
