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
}
