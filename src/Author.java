import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String name, String surNameAuthor) {
        this.nameAuthor = name;
        this.surNameAuthor = surNameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurNameAuthor() {
        return this.surNameAuthor;
    }

    public String toString() {
        return nameAuthor + " " + surNameAuthor;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return nameAuthor.equals(a2.nameAuthor) && surNameAuthor.equals(a2.surNameAuthor);
     }

    public int hashCode() {
        return java.util.Objects.hash(nameAuthor);
    }
}
