class Item<T>{
    private T data;
    public void set_data(T d){
        data = d;
    }
    public T get_data(){
        return data;
    }
}
public class Generic{
    public static void main(String [] agrs){
        Item<String> obj1 = new Item<String>();
        obj1.set_data("Srinjinee Mitra");
        System.out.println(obj1.get_data());

        Item<Integer> obj2 = new Item<Integer>();
        obj2.set_data(100);
        System.out.println(obj2.get_data());
    }
}
