public class ArrayRotation {
    public static void main(String[] args) {

        int a[]={1,3,5,6,7,8,9};


            cycleRoration(a);

for (int k:a){
    System.out.println(k);
}

    }

    public static void roration(int a[]){
        if(a==null )throw new IllegalArgumentException();
         int i=0;
        int temp=a[0];
        for ( i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[i]=temp;
    }


    public static void cycleRoration(int a[]){
        if(a==null )throw new IllegalArgumentException();
        int i=0;
        int temp=a[a.length-1];
        for ( i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[i]=temp;
    }


}
