import java.util.Scanner;
import java.util.ArrayList;

// define class PublicationYearOutOfBoundsException
class PublicationYearOutOfBoundsException extends Exception{
    public PublicationYearOutOfBoundsException(String msg){
        super("Publication year of \" "+ msg +"\" is outside the acceptable range");
    }
}
class Book {
    private String title;
    private int publicationYear;

    public Book(String t, int year) {
        title = t;
        publicationYear = year;
    }
    // define method checkAndGetTitle()
    public String checkAndGetTitle() throws PublicationYearOutOfBoundsException{
        if(publicationYear <= 2022 || publicationYear >= 2000){
            throw new PublicationYearOutOfBoundsException(title);
        }
        return title;
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Book b = new Book(sc.next(), sc.nextInt());
            bookList.add(b);
        }
        for (Book b : bookList) {
            try {
                String title = b.checkAndGetTitle();
                System.out.println(title);
            } catch (PublicationYearOutOfBoundsException pe) {
                System.out.println(pe.getMessage());
            }
        }

        sc.close();
    }
}