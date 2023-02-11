import java.util.Objects;

public class Book {
   private String titleBook;
    private Author nameAuthor;
    private int yearOfCreation;

    public Book(String title, Author nameAuthor, int yearOfCreation) {
        this.titleBook = title;
        this.yearOfCreation = yearOfCreation;
        this.nameAuthor = nameAuthor;
    }
    public String getTitleBook() {
        return this.titleBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearOfCreation() {
        return this.yearOfCreation;
    }

    public void setYearOfCreation(int year) {
        this.yearOfCreation = year;
    }
    public String toString() {
        return titleBook + " " + nameAuthor + " " + nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfCreation == book.yearOfCreation && Objects.equals(titleBook, book.titleBook) && Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, nameAuthor, yearOfCreation);
    }
}
