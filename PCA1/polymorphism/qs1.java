// Create a base class Shape with methods area() and perimeter(). Derive two classes Rectangle and Circle. 
// Override the methods in each subclass. 
// Write a test class to demonstrate runtime polymorphism.

import java.util.*;
//abstract class shape
abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area(){
        return length*breadth;
    }
    @Override
    double perimeter(){
        return 2*(length+breadth);
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }
}

class qs1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle :");
        double l = sc.nextDouble();
        System.out.println("Enter breadth of rectangle :");
        double b = sc.nextDouble();
        System.out.println("Enter radius of circle :");
        double r = sc.nextDouble();

        Shape ob = new Rectangle(l,b);
        System.out.println("Rectangle Area = "+ob.area());
        System.out.println("Rectangle perimeter = "+ob.perimeter());

        Shape obj = new Circle(r);
        System.out.println("Circle Area = "+obj.area());
        System.out.println("Circle perimeter = "+obj.perimeter());

    }
}