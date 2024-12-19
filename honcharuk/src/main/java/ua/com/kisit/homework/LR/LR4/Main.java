package ua.com.kisit.homework.LR.LR4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення колекції об'єктів
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Додавання об'єктів до колекції
        libraryItems.add(new Book(1, "Кобзар", "Тарас Шевченко", 3));
        libraryItems.add(new Journal(2, "Науковий вісник", "Інститут науки", 5));
        libraryItems.add(new Newspaper(3, "День", "Редакція газети", "2024-12-19"));

        // Виведення інформації про об'єкти
        for (LibraryItem item : libraryItems) {
            item.displayInfo();
        }
    }
}
