//package Assignment_01;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//public class BookProcessor {
//    private List<Book> books;
//
//    public BookProcessor(List<Book> books) {
//        this.books = books;
//    }
//
//    public void displayAllBooks() {
//        books.forEach(Book::displayBookInfo);
//    }
//
//    public void displayBooksByAuthor(String author) {
//        books.stream()
//                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
//                .forEach(Book::displayBookInfo);
//    }
//
//    public double calculateAveragePrice() {
//        return books.stream()
//                .mapToDouble(book -> book.getMetadata().getPrice())
//                .average()
//                .orElse(0.0);
//    }
//
//    public void displayBookWithHighestPrice() {
//        Optional<Book> book = books.stream()
//                .max((b1, b2) -> Double.compare(b1.getMetadata().getPrice(), b2.getMetadata().getPrice()));
//        book.ifPresent(Book::displayBookInfo);
//    }
//
//    public List<Book> findBooksByCategory(String category) {
//        return books.stream()
//                .filter(book -> book.getMetadata().getCategories().contains(category))
//                .collect(Collectors.toList());
//    }
//}
