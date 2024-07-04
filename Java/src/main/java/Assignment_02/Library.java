package Assignment_02;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> mediaItems;
    private List<LibraryObserver> observers;

    public Library() {
        this.mediaItems = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaItems.add(media);
        notifyObservers(new LibraryEvent("New media added"));
    }

    public void updateMediaPrice(T media, double newPrice) {
        media.updatePrice(newPrice);
        notifyObservers(new LibraryEvent("Media price updated"));
    }

    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            observer.updateEvent(event);
        }
    }
}
