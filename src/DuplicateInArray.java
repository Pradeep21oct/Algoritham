import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,6,1,8,9,3,4,6,7,5};

        System.out.println(findDuplicate(a));
    }

    public static Set<Integer> findDuplicate(int a[]){
        Set <Integer>s=new HashSet<>();
       if(a==null) throw new IllegalArgumentException();
       for(int i:a) {
           int index = Math.abs(i)-1;

           if(a[index]<0){
               s.add(i);
           }else {
               a[index]=-a[index];
           }
       }
        return s;
    }
}
