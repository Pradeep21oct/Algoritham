public class BubbleSort {

    public static void main(String str[]){
          int a[]={2,55,78,9,1,0,5,45};
          bubbleSort(a);
         for(int t:a){
             System.out.print(t+" ");
         }
    }

    public static void bubbleSort(int a[]){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]) {
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }
        }
    }
}
