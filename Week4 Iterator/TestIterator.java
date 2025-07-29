interface Iterator{
    Boolean has_next();  // whether there is another object after the current one : ans in YES or NO 
    Object get_next(); // function to return that next object
}

interface BackIterator{
    Boolean has_prev();
    Object get_prev();
}
class Items{
    private int[] arr = {10,20,30,40,50};

    public ItemIterator getItemIterator(){
        return new ItemIterator(); // creates a new object of ItemIterator class and return it 
    }

    private class ItemIterator implements Iterator, BackIterator{ // it is a private class within the class Items so we can't create a object of ItemIterator
        private int i;
        public ItemIterator(){
            i = -1;
        }
        public Boolean has_next(){
            if(i == arr.length - 1){
                return false;
            }
            return true;
        }
        public Object get_next(){
            i++;
            return arr[i];
        }
        public Boolean has_prev(){
            if(i == 0){
                return false;
            }
            return true;
        }
        public Object get_prev(){
            i--;
            return arr[i];
        }
    }
}

class TestIterator{
    public static void main(String [] args){
        Items obj = new Items();
        Iterator it = obj.getItemIterator();
        while(it.has_next()){
            System.out.println((Integer)it.get_next());
        }

        BackIterator bit = (BackIterator)it;
        while(bit.has_prev()){
            System.out.println(bit.get_prev());
        }
    }
}