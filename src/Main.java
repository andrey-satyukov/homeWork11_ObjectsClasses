public class Main {



    public static void main(String[] args) {
        Author rowling = new Author("Joahn", "Rowlng");
        Author gorkiy = new Author("Maksim", "Gorkiy");
        Book Potter = new Book("Harry Potter", rowling, 1997);
        Book troe = new Book("Troe", gorkiy, 1900);
        System.out.println("Rowling.getNameAuthor() = " + rowling.getNameAuthor());
        System.out.println("Potter.getYearOfCreation() = " + Potter.getYearOfCreation());
        Potter.setYearOfCreation(1998);
        System.out.println("Potter.getYearOfCreation() = " + Potter.getYearOfCreation());
    }
}