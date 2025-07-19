/*
 * You have given two integers as input to form an object(r1) of type Rectangle and two double values as input to form an object (r2) of type rectangle. Complete the java code to print the larger area among the areas of r1 and r2.
 * Define a generic class Rectangle with following members:
 - Instance variables length and breadth
 - Constractor to initialize the instance variables 
 - method area() that returns the larger area among that of r1 and r2
 - method compareArea()mthat returns the larger among that of r1 and r2

 * class Test has the method main() and takes two integers and two double values as input to create two objects of Rectangle type. it then invokes the necessary methods and prints larger area.
  
 *What you have to do :
 - Define method area() and compareArea() of class Rectangle.
*/

import java.util.*;
class Rectangle<T extends Number>{
    private T length;
    private T breadth;
    public Rectangle(T len, T bre){
        length = len;
        breadth = bre;
    }
    //Define method public double area()
    public double area(){
        return length.doubleValue()*breadth.doubleValue();
    }
    //Define method compareArea()
    public double compareArea(Rectangle<?> rec){
        if(this.area() > rec.area()){
            return this.area();
        }
        else{
            return rec.area();
        }
    }
}
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Rectangle<Integer> r1 = new Rectangle<>(sc.nextInt(), sc.nextInt());
        Rectangle<Double> r2 = new Rectangle<>(sc.nextDouble(), sc.nextDouble());
        double large_area = r1.compareArea(r2);
        System.out.println(large_area);
        sc.close();
    }
}
