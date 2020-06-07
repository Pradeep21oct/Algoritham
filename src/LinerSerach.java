public class LinerSerach {
    private  int []arry;

    public LinerSerach( int n){
        this.arry=new int[20];
    }

    public static void main(String arg[]){

        int b[]={4,5,7,8,23,67,10,5,2};
        System.out.println("liner search with itration:: "+search(b,4));
        System.out.println("liner serach with recurrsion:: "+serachRecurssion(b,0,67));

    }




    private static  boolean search(int[] a,int key){

        for(int i:a){
            if(i==key) {
                return true;
            }
        }
        return false;
    }

    private static boolean serachRecurssion(int a[],int left,int key){
        if(a[left]==key) return true;
        if(left>=a.length-1) return false;
        return serachRecurssion(a,left+1,key);

    }

}
