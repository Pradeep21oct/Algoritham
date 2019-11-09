public class ReverseString {


    public static void main(String arg[]){
        String  test="Hello world shanaya;'";
        System.out.println(reverse(test));

    }


    private  static String reverse(String str){
        if(str==null || str.length()<2) return str;
         String st="";

        for(int i =0; i<str.length();i++){

            st+=str.charAt(str.length()-i-1);
        }
            return st;
    }

}
