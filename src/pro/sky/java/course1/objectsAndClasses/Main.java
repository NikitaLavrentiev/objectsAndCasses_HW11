package pro.sky.java.course1.objectsAndClasses;

import pro.sky.java.course1.objectsAndClasses.Author;
import pro.sky.java.course1.objectsAndClasses.Book;

public class Main {

    public static void main(String[] args) {
        //Напишите небольшой библиотечный справочник, где хранится информация о книгах.
        //
        //Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем протестировать работу вашего кода.
        //Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
        //Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
        //Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
        //Напишите конструкторы для обоих классов, заполняющие все поля.
        //Создайте геттеры для всех полей автора и всех полей книги.
        //Создайте сеттер для поля «Год публикации» у книги.
        //В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
        //Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
        //Метод main не должен находиться в классах Book и Author.
        //Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        //В том же методе main измените год публикации одной из книг с помощью сеттера.

        Author author1 = new Author ("Лев", "Толстой");

        Book warAndPiece =;
    }
    Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.age = " + sarah.age);

    Person john = new Person("John", 13);
        System.out.println("john.name = " + john.name);
        System.out.println("john.age = " + john.age);
}