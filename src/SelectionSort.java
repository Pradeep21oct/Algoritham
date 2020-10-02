public class SelectionSort {

    public static void main(String str[]){
        int a[]={2,55,78,9,1,0,5,45};
        selectionSort(a);
        for(int t:a){
            System.out.print(t+" ");
        }
    }



    public static void selectionSort(int input[]){

        for(int i=0;i<input.length;i++){
            int temp=input[i];
            int min=i;
            for (int j=i+1;j<input.length;j++){
                if(input[j]<input[min]){
                    min=j;
                }
            }
            input[i]=input[min];
            input[min]=temp;
        }



    }
}


