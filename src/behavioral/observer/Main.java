package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel ACV = new YouTubeChannel();
        Subscriber jay = new Subscriber("Jay");
        Subscriber adams = new Subscriber("Adams");

        ACV.subscribe(jay);
        ACV.subscribe(adams);
        ACV.uploadVideo("Baap, Bijli aur Bill Ft.Shahid Kapoor");

        Subscriber alice = new Subscriber("Alice");
        ACV.subscribe(alice);
        ACV.unsubscribe(jay);

        ACV.uploadVideo("New Video!");
    }
}
