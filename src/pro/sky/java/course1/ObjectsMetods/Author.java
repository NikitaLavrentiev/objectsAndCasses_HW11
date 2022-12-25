package pro.sky.java.course1.ObjectsMetods;
//Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//Обратите внимание, что toString книги не должен дублировать код из toString автора,
// а должен делегировать (вызывать) его версию метода.

import java.util.Objects;

public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author(String firstName, String lastName) {
        this.authorFirstName = firstName;
        this.authorLastName = lastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return authorFirstName + " " + authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstName.equals(author.authorFirstName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}