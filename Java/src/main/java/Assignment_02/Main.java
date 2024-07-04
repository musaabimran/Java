package Assignment_02;

public class Main {
    public static void main(String[] args) {
        Library<Media> library = new Library<>();

        LibraryObserver observer = new LibraryObserver() {
            @Override
            public void updateEvent(LibraryEvent event) {
                System.out.println("Event received: " + event.getEventDetails());
            }
        };

        library.addObserver(observer);

        Book book = new Book(29.99);
        library.addMedia(book);

        Movie movie = new Movie(19.99);
        library.addMedia(movie);

        library.updateMediaPrice(book, 24.99);

        // magazine
        Magazine magazine = new Magazine(9.99);
        library.addMedia(magazine);


    }
}
