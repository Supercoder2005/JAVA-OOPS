// Book Details (program uses a constructor to initialize the title,author,price of a book)

package PCA1.Constructor;
class BookDetails{
    String title;
    String author;
    double price;
    // non parameterized constructor 
    public BookDetails(){
        title = "Kadombini Devi's Suicide Note";
        author = "Kadombini Devi";
        price = 560.70;
    }
    void display(){
        System.out.println("Book Title :"+title+" ,Author :"+author+" ,Price :"+price);
    }
}
public class qs3 {
    public static void main(String[] args) {
        BookDetails bd = new BookDetails();
        bd.display();
    }
}
