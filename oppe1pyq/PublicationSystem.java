/*
In a publication system, Author a1 contributes to a set of books. Author a2 also contributes
 to all the books contributed by a1 except for the second book, which a2 replaces with another
 book. Write a program that defines two classes Author and PublicationSystem. Define a
 copy constructor to create a2 from a1 such that changing the values of instance variables of
 either a2 or a1 does not affect the other one. The program accepts name of author a2 and
 the new book contributed by a2 as input.
 • Class Author has/should have the following members.– Private instance variables String name and String[] books to store author
 name and books contributed respectively– Define required constructor(s)– Accessor methods getName( ) and getBook(int) to get the author name and
 the book at a specific index respectively.– Mutator methods setName(String) and setBook(int,String) to set the author
 name and the book at a specific index respectively.
 • Class PublicationSystem has method main that does the following.– Two objects of Author a1 and a2 are created. a2 is created using a1– name of Author a2 and second book contributed by a2 are updated by taking
 the input– Finally, name of a1, a2 and second book contributed by a1 and a2 are printed
 What you have to do
 • Define a constructor to initialize the instance variables in class Author.
 • Define a copy constructor to create a deep copy of another Author object in class
 Author.

 */

import java.util.*;
class Author{
    private String name;
    private String[] books;
    //***** Define constructor(s) here
    public Author(String name,String[] books){
        this.name = name;
        this.books = books;
    }
    // copy constractor 
    public Author(Author a1){
        this.name = a1.name;
        int n = a1.books.length;
        this.books = new String[n];
        for(int i=0;i<n;i++){
            this.books[i] = a1.books[i];
        }
    }
    public void setName(String n) {
        name = n;
    }
    public void setBook(int indx, String b) {
        books[indx] = b;
    }
    public String getName() {
        return name;
    }
    public String getBook(int indx) {
        return books[indx];
    }
}
 public class PublicationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Maths", "DL","DSA","DC"};
        Author a1 = new Author("Nandu", books);
        Author a2 = new Author(a1);
        a2.setName(sc.next());
        a2.setBook(1,sc.next());
        System.out.println(a1.getName() + ": "+ a1.getBook(1));
        System.out.println(a2.getName() + ": " + a2.getBook(1));
        sc.close();
    }
 }
