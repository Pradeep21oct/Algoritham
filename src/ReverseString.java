public class ReverseString {


    public static void main(String arg[]){
        String  test="Hello world shanay";
        System.out.println(reverseWord(test));

    }


    private  static String reverse(String str){
        if(str==null || str.length()<2) return str;
         String st="";

        for(int i =0; i<str.length();i++){

            st+=str.charAt(str.length()-i-1);
        }
            return st;
    }
    private  static String reverseWord(String str){
        if(str==null || str.length()<2) return str;
        String st="";
       String temp[] =str.split(" ");
        for(int i =temp.length-1; i>=0;i--){

            st+=temp[i]+" ";
        }
        return st;
    }

}
