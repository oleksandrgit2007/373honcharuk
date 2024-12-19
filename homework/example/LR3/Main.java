package ua.com.kisit.homework.example.LR3;

public class Main {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1L);
        category.setName("Macbook Air");
        category.setDescription("Найбільш тонкий і легкий ноутбук Apple");
        category.setImage("/image/air.jpg");


        System.out.println(category.toString());



        Product product = new Product();
        product.setId(1L);
        product.setName("Macbook Air M1 256");
        product.setPrice(42000);
        product.setDescription("Завдяки чипу Apple M1 найбільш тонкий і легкий ноутбук Apple зазнав вражаючих змін. Центральний процесор відтепер працює до 3,5 раза швидше. Графічний — до 5 разів.");
        product.setCategory(category);

        System.out.println(product);

    }
}