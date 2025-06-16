package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String video;

    public void uploadVideo(String video) {
        this.video = video;
        notifyObservers();
    }
    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(video);
        }
    }
}
