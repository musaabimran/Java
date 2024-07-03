package Assignment_01;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // reading from json file and gson object
        Gson gson = new Gson();
        try {
            File file = new File("src/main/java/Assignment_01/Books.json");
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(file.getAbsolutePath()));
            JsonReader jsonReader = new JsonReader(bufferedReader);
            Book[] books = gson.fromJson(jsonReader, Book[].class);
            ArrayList<Book> bookList = new ArrayList<>();
            for (Book book : books) {
                bookList.add(book);
            }
            BookProcessor bookProcessor = new BookProcessor(bookList);
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("1. Display all books");
                System.out.println("2. Display books by author");
                System.out.println("3. Calculate average price of books");
                System.out.println("4. Display book with highest price");
                System.out.println("5. Find books by category");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        bookProcessor.displayAllBooks();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter author name: ");
                        String author = scanner.nextLine();
                        bookProcessor.displayBooksByAuthor(author);
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Average price of books: " + bookProcessor.calculateAveragePrice());
                        System.out.println();
                        System.out.println();
                        break;
                    case 4:
                        bookProcessor.displayBookWithHighestPrice();
                        System.out.println();
                        System.out.println();
                        break;
                    case 5:
                        System.out.print("Enter category: ");
                        String category = scanner.nextLine();
                        bookProcessor.findBooksByCategory(category).forEach(Book::displayBookInfo);
                        System.out.println();
                        System.out.println();
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
