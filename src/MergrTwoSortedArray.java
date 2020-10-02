public class MergrTwoSortedArray {

    public static void main(String[] args) {
        int a[]={};
        int b[]={0,2,4,5,6,7,8,9,10};

        for(int i:merge(a,b))System.out.print(i+",");

    }

    public static int [] merge(int array1[],int array2[]){
        if(array1.length==0 && array2.length==0){
            return null;
        }
        int i=0,j=0,k=0;
        int result[]= new int[array1.length+array2.length];
       while (i<array1.length && j<array2.length){
           if(array1[i]<array2[j]){
               result[k++]=array1[i++];
           }else {
               result[k++]=array2[j++];
           }
       }

       while (i<array1.length)result[k++]=array1[i++];
       while (j<array2.length)result[k++]=array2[j++];
        return result;
    }
}
