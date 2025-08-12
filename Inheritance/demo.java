class Addition{
    int a,b;
    void setNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }
    int add (){
        return a + b;
    }
}

class Child extends Addition{
    void display(){
        System.out.println("Addition = "+add());
    }
}

public class demo {
    public static void main(String[] args) {
        Child c = new Child();
        c.setNumbers(6,9);
        c.display();
    }
}
