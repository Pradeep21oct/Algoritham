public class MergerTwoArray {
    public static void main(String[] args) {
//sorted array
        int a[]={1,3,5,6,7};
        int b[]={0,2,4,5,6,7,8,9,10};
         merge(a,b);
    }


    public static void merge(int []a,int []b){

        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[a.length+b.length];

        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k++]=a[i++];
            } else {
                res[k++]=b[j++];
            }
        }
        while (i<a.length) res[k++]=a[i++];
        while (j<b.length) res[k++]=b[j++];

        for (int c:res) System.out.println(c);
    }
}
