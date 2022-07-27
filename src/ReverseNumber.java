public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(rerser(98765));
    }

    private static int rerser(int num){
        if(num==0) return 0;
          System.out.print(num%10);
          return rerser(num/10);

    }



}
