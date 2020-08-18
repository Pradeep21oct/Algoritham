public class ReverseArray {

    public static void main(String[] args) {
        int c[]={4,5,6,8,9,12,67};
        reverseinpace(c);
    }

    public static void reverse(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    public static void reverseinpace(int a[]){
        for(int i=0;i<a.length/2;i++){
            int tempa=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=tempa;
        }
        for (int c:a){
            System.out.println(c);
        }
    }
}
