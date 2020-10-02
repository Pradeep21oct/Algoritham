public class ReveserNumber {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }


    private static int reverse(int x){
        if (x==0) return 0;
        int rev=0;
        while(x!=0){
            int t=x%10;
            x=x/10;
            if(t>Integer.MAX_VALUE/10||(t==Integer.MAX_VALUE/10 && Integer.MAX_VALUE>7)) return 0;
            if(t<Integer.MIN_VALUE/10||(t==Integer.MIN_VALUE/10 && Integer.MIN_VALUE<-8)) return 0;
            rev=rev*10+t;
        }
        return rev;
    }
}
