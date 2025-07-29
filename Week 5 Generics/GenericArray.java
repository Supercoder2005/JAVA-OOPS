class Student{
    private int roll;
    private String name;
    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public String toString(){
        return roll + " : " + name + " , ";
    }
}


class DataItems<T>{
    private T[] arr; // array of generic type
    public DataItems(T[] a){
        arr = a;
    }
    public void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}

public class GenericArray{
    public static void main(String[] args){
        String[] str = {"Srinjinee", "Oornee", "Apurba", "Baishali"};
        DataItems<String> items = new DataItems<String>(str);
        items.print();

        Student[] students = {new Student(10,"Rima Sen"),new Student(20,"Rahim Seth"),new Student(30,"Prashari Banerjee")};
        DataItems<Student> items1 = new DataItems<Student>(students);
        items1.print();
    }
}
