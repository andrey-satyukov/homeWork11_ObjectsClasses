public class Main {



    public static void main(String[] args) {
        Author rowling = new Author("Joahn", "Rowlng");
        Author rowlingNew = new Author("Joahn", "Rowlng");
        Author gorkiy = new Author("Maksim", "Gorkiy");
        Book Potter = new Book("Harry Potter", rowling, 1997);
        Book PotterNew = new Book("Harry Potter", rowling, 2000);
        Book troe = new Book("Troe", gorkiy, 1900);
        System.out.println("Rowling.getNameAuthor() = " + rowling.getNameAuthor());
        System.out.println("Potter.getYearOfCreation() = " + Potter.getYearOfCreation());
        Potter.setYearOfCreation(1998);
        System.out.println("Potter.getYearOfCreation() = " + Potter.getYearOfCreation());
        System.out.println("PotterNew.getYearOfCreation() = " + PotterNew.getYearOfCreation());
        System.out.println(rowling);
        System.out.println(Potter);
        System.out.println(Potter.equals(PotterNew));
        System.out.println(Potter.equals(troe));
        System.out.println(rowling.equals(gorkiy));
        System.out.println(rowling.equals(rowlingNew));
        System.out.println(Potter.hashCode());
        System.out.println(rowling.hashCode());
    }
}