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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && surNameAuthor.equals(author.surNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surNameAuthor);
    }
}
