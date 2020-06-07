import java.util.stream.Stream;

public class ReverserArray {

    public static void main(String arg[]){
        int b[]={4,5,7,8,23,67,10,5,2};
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
        System.out.print("\n");
          reverser(b);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
        System.out.print("\n");
        reverser(b);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }

    private static void reverser(int a[]){

        if(a.length<2) return;
          int len=a.length;
        for(int i=0;i<len/2;i++){
            int temp=a[i];
            a[i]=a[len-1-i];
            a[len-1-i]=temp;

        }



    }
}
