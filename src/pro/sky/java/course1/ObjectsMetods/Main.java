package pro.sky.java.course1.ObjectsMetods;

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

        Author aleksandrAuzan = new Author("Александр", "Аузан");
        Book economicsOfEverything = new Book("Экономика всего", aleksandrAuzan, 1992);
        System.out.println(economicsOfEverything.getBookInfo());

        economicsOfEverything.setPublishingYear(2020);
        System.out.println(economicsOfEverything.getBookInfo());

        Author avinashDixit = new Author("Авинаш", "Диксит");
        Book theArtOfStrategy = new Book("Теория игр", avinashDixit, 2018);
        System.out.println(theArtOfStrategy.getBookInfo());
    }
}