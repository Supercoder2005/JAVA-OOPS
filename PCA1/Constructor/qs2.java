// Bank Account (program uses a constructor that demonstrates the initialization of account holder's name and balance)

package PCA1.Constructor;
class BankAccount{
    String name;
    double balance;
    // parameterized constructor
    public BankAccount(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    void display(){
        System.out.println("Name :"+name+" ,Balance:"+balance);
    }
}
public class qs2 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Apurba Ratan Mitra",95670.50);
        ba.display();
    }
}
