//Person Details (program uses a constructor to initialize the name and age of a person)

package PCA1.Constructor;
import java.util.*;
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name :"+name+" Age:"+age);
    }
}
public class qs1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        Person p = new Person(name,age);
        p.display();
        sc.close();
    }
}
