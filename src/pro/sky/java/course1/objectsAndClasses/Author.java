package pro.sky.java.course1.objectsAndClasses;

public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author (String firstName, String lastName) {
        this.authorFirstName = firstName;
        this.authorLastName = lastName;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public String getAuthorLastName(){
        return authorLastName;
    }
    public String combineAuthorFIO() {
        return authorFirstName + " " + authorLastName;
    }
}