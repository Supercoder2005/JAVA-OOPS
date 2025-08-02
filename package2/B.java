package package2;
import package1.A; // import the class A from another package named package1
public class B{
    public static void main(String[] args) {
        A obj = new A();
        // obj.AMethod();
        // obj.BMethod();
        // obj.CMethod();
        obj.DMethod(); // public
    }
}
