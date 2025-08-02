package package1;

// only we can import a public class through <package_name.class_name> in another package 
public class A {
    // when no access specifier is mention those methods can be accessed through any java files present inside of a particular package , but not from other package 
    void AMethod(){
        System.out.println("Method A");
    }
    // private method only can be used inside of the class where the method is defined. 
    private void BMethod(){
        System.out.println("Method B");
    }
    // protected method is used only inside of the class where it is defined and also inside of its subclasses 
    protected void CMethod(){
        System.out.println("Method C");
    }
    // public method is used through out every package
    public void DMethod(){
        System.out.println("Method D");
    }

}
