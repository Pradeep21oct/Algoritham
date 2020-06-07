public class BinarySearch {


    private int []array;

    public BinarySearch(int[] arr){
        this.array=arr;
    }




    private   int binarySearch(int start,int end, int item){
        if(end<start) return -1;

        int middile=(start+end)/2;
        if(item==array[middile]) return  middile;
        else if(item<array[middile]) return binarySearch(start,middile-1,item);
        else return binarySearch(middile+1,end,item);

    }
    public int bSearch(int item){
        return binarySearch(0,array.length-1,item);
    }


    public static void main(String[] args) {

        int [] array={2,5,6,7,12,34,90};
        BinarySearch search=new BinarySearch(array);
        System.out.println(search.bSearch(112));

    }
}
