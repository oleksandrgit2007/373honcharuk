package ua.com.kisit.homework.LR.LR3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення книг;
        Book book1 = new Book(1, "Кобзар", "Тарас Шевченко", 1);
        Book book2 = new Book(2, "Тіні забутих предків", "Михайло Коцюбинський", 4);
        Book book3 = new Book(3, "Лісова пісня", "Леся Українка", 3);
        Book book4 = new Book(4, "Місто", "Валер'ян Підмогильний", 2);

        // Створення читачів
        List<Book> borrowedBooks1 = new ArrayList<>();
        Reader reader1 = new Reader(1, "Олександр Гончарук", "2373044@kisit.kneu.edu.ua", borrowedBooks1);

        List<Book> borrowedBooks2 = new ArrayList<>();
        Reader reader2 = new Reader(2, "Іван Іваненко", "ivan.ivanenko@example.com", borrowedBooks2);

        // Створення бібліотекаря
        Librarian librarian = new Librarian(1, "Петро Петренко");

        // Демонстрація видачі книг
        librarian.issueBook(reader1, book1);
        librarian.issueBook(reader2, book2);
        librarian.issueBook(reader1, book3);
        librarian.issueBook(reader2, book4);

        // Виведення стану
        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}
