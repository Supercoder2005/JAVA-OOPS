import java.util.*;
class Rectangle<T extends Number>{
    private T length;
    private T breadth;
    public Rectangle(T len,T bre){
        length= len;
        breadth= bre;
    }
    //Definemethod publicdouble area()here
    public double area(){
        return length.doubleValue() * breadth.doubleValue();
    }
    //Definemethod compareArea()here
    public double compareArea(Rectangle<?> rec){
        if (this.area() > rec.area()){
            return this.area();
        }
        else{
            return rec.area();
        }
    }
}

public class TestGenerics {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Rectangle<Integer>r1 =new Rectangle<>(sc.nextInt(),sc.nextInt());
    Rectangle<Double>r2 =new Rectangle<>(sc.nextDouble(), sc.nextDouble());
    double large_area =r1.compareArea(r2);
    System.out.println(large_area);
    sc.close();
    }
}
