import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {

   private int length=0;
   private Object data[];

   public MyArrayList(){
       this.length=0;
       this.data=  new Object[8];
   }

   public void push(T item){

        this.data[length++]=item;
   }

   public T pop(){
       T item=(T)this.data[length-1];
       this.length--;
       return item ;
   }

   public int size(){
       return length+1;
   }


    public static void main(String[] args) {
        MyArrayList <Integer>array=new MyArrayList<>();
        array.push(1);
        array.push(23);
        array.push(23);
        array.push(23);
        array.push(23);
        array.push(23);
        array.push(45);
       System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.size());
        System.out.println(array.length);
        System.out.println(array);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "length=" + length +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
