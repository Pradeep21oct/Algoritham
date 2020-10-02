public class InsertionSort {

    public static void main(String str[]){
        int a[]={2,55,78,9,1,0,5,45};
        insertioSort(a);
        for(int t:a){
            System.out.print(t+" ");
        }
    }



    public  static void insertioSort(int a[]){


        for(int i=1;i<a.length;i++){

           int key=a[i];
           int j=i-1;

           while (j>=0 && a[j]>key){
               a[j+1]=a[j--];

           }
         a[j+1]=key;
        }
    }
}
