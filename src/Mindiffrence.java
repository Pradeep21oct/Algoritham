public class Mindiffrence {
    public static void main(String[] args) {
        int []a1={4,5,7,86};
        int []a2={10,20,60,91};
        System.out.println(maxdiff(a1,a2));


    }

    public static int mindiff(int a1[],int a2[]){

        if(a1==null || a2==null) throw new IllegalArgumentException();
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        while (i< a1.length && j<a2.length){
            if(Math.abs(a1[i]-a2[j])<min){
                min=Math.abs(a1[i]-a2[j]);
            }

            if(a1[i]<a2[j]) i++;
            else j++;
        }
        return min;
    }

    public static int maxdiff(int a1[],int a2[]){

        if(a1==null || a2==null) throw new IllegalArgumentException();
        int max=0;
        int i=0,j=0;
        int a=-1,b=-1;
        while (i< a1.length && j<a2.length){
            if(Math.abs(a1[i]-a2[j])>max){
                max=Math.abs(a1[i]-a2[j]);
                a=a1[i];
                b=a2[j];
            }

            if(a1[i]>a2[j]) i++;
            else j++;
        }
        System.out.println("("+a+","+b+")");
        return max;
    }
}
