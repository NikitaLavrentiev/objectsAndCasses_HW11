public class Author {
    String authorFirstName;
    String authorLastName;

    public static Author createAuthorName(String firstName, String lastName) {
        Author author = new Author();
        author.authorFirstName = firstName;
        author.authorLastName = lastName;
        return author;

    }
}

