package Assignment_01;

import java.util.List;


public class Book {
    private String title;
    private String author;
    private Metadata metadata;

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + metadata.getPrice());
        System.out.println("Categories: " + metadata.getCategories());
        System.out.println("ISBN: " + metadata.getIsbn());
        System.out.println("Pages: " + metadata.getPages());
        System.out.println();
        System.out.println();
    }

    public static class Metadata {
        private double price;
        private List<String> categories;
        private String isbn;
        private int pages;

        // constructor
        public Metadata(double price, List<String> categories, String isbn, int pages) {
            this.price = price;
            this.categories = categories;
            this.isbn = isbn;
            this.pages = pages;
        }

        // setters
        public void setPrice(double price) {
            this.price = price;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        // getters
        public double getPrice() {
            return price;
        }

        public List<String> getCategories() {
            return categories;
        }

        public String getIsbn() {
            return isbn;
        }

        public int getPages() {
            return pages;
        }
    }

        //parameterise constructor
        public Book(String title, String author, Metadata metadata) {
            this.title = title;
            this.author = author;
            this.metadata = metadata;
        }
        // setters
        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        // getters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public Metadata getMetadata() {
            return metadata;
        }

        // toString
        @Override
        public String toString() {
            return "Book{" +
                    "title:'" + title + '\'' +
                    ", author:'" + author + '\'' +
                    ", metadata:{" + metadata + "}" +
                    '}';
        }
    }

