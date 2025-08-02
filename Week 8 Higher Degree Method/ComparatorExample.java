import java.util.*;
class Student{
    int roll;
    String name;
    public Student(int r,String n){
        roll = r;
        name = n;
    }
    public String toString(){
        return "roll : "+roll+" "+"name : "+name;
    }
}
// class CompareByRoll implements Comparator<Student>{
//     public int compare(Student a,Student b){
        // if(a.roll == b.roll){
        //     return 0;
        // }
        // else if(a.roll>b.roll){
        //     return 1;
        // }
        // else{
        //     return -1;
        // }
        // instead of the whole full if-else block you can write only this line :
//         return (a.roll-b.roll);
//     }
// }
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> people = Arrays.asList(
            new Student(30, "Alice"),
            new Student(25, "Bob"),
            new Student(35, "Charlie")
        );
        // CompareByRoll cr = new CompareByRoll();
        Collections.sort(people, (a,b) -> a.roll - b.roll);
        System.out.println(people);

        // sort on the basis of ascending order of name length of the students
        Collections.sort(people, (a,b) -> a.name.length() - b.name.length());
        System.out.println(people);
    }
}
