/*
Complete the Java program to demonstrate the use of abstract classes and interfaces. You
 have to complete the definition of classes JuniorRS and SeniorRS to obtain the output as
 given in the public test cases.
 • Interface IResearchScholar has two methods: public void teaches(String str)
 and public void studies(String str).
 • Defineclasses JuniorRS and SeniorRS such that JuniorRS implements IResearchScholar
 and SeniorRS extends JuniorRS.
 • Class InterAbstrTest extends SeniorRS, and has the main method. An object of
 JuniorRS invokes the method studies, and an object of SeniorRS invokes methods
 studies and teaches.
 */

 import java.util.Scanner;

 interface IResearchScholar{
    public void teaches(String str);
    public void studies(String str);
 }
 abstract class JuniorRS implements IResearchScholar{
    public void studies(String str1){
        System.out.println("TA studies "+str1);
    }
 }
 class SeniorRS extends JuniorRS{
    public void studies(String str2){
        System.out.println("TA studies "+str2);
    }
    public void teaches(String str2){
        System.out.println("Ta teaches "+str2);
    }
 }
  public class InterAbstrTest extends SeniorRS {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    JuniorRS jrs = new InterAbstrTest();
    SeniorRS srs = new InterAbstrTest();
    jrs.studies(str1);
    srs.studies(str2);
    srs.teaches(str2);
    sc.close();
    }
 }