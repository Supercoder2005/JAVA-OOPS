
// Define a class Items that implements interface Cloneable, and has the following
// members.
// A public instance variable item of type String[] to store the item names
// Constructor(s) and accessors to, respectively, initialize and access the instance
// variable
// Override the method clone
// Override the method toString so that the format of the output is in accordance
// with those in the test cases
// Define a class Customer that implements interface Cloneable, and has the following
// members.
// Instance variable name of type String to store the name of the customer
// Instance variable of type Items to store the items purchased by the customer
// Implement the constructor(s), the accessor getItems() to return the object
// of Items, and the mutator setName(String s) to update the name of the
// customer.
// Override the method clone
// Override the method toString so that the format of the output is in accordance


import java.util.*;

//Define classes Items, Customer
class Items implements Cloneable{
  public String[] item;
  public Items(String[] item){
    this.item = item;
  }
  public void setItems(String[] item){
    this.item = item;
  }
  public String[] getItems(){
    return item;
  }
  // override method clone() for deep copy 
  public Items clone() throws CloneNotSupportedException{
    Items obj = (Items)super.clone(); // shallow copy
    obj.item = this.item.clone(); // deep copy
    return obj;
  }
  // override method toString 
  public String toString(){
    return Arrays.toString(item);
  }
}


class Customer implements Cloneable{
  public String name;
  public Items items;
  public Customer(String name, Items items){
    this.name = name;
    this.items = items;
  }
  public Items getItems(){
    return items;
  }
  public void setName(String name){
    this.name = name;
  }
  // override the clone() method 
  public Customer clone() throws CloneNotSupportedException{
    Customer obj = (Customer)super.clone();
    obj.items = this.items.clone();
    return obj;
  }
  // override method toString
  public String toString(){
    return name+" "+items.toString();
  }
}


public class Order {
  public static void main(String[] args) throws CloneNotSupportedException{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // number of items
    String[] itm = new String[n];
    for(int i = 0; i < n; i++){
      itm[i] = sc.next(); // list of items
    } 
    Customer c1 = new Customer("naresh", new Items(itm));
    Customer c2 = c1.clone();   
    c2.getItems().item[0] = sc.next();   //Update first item of c2
    c2.setName("suresh"); //Update name of c2
    System.out.println(c1);
    System.out.println(c2);
  }
}   