public class ReverseString {


    public static void main(String arg[]){
        String  test="Hello world shanay";
        System.out.println(reversev2(test));

    }


    public static String reversev2(String str){
        if(str==null || str.length()<0){
            return null;
        }



        return new StringBuilder(str).reverse().toString();
    }
    public static String reversev(String str){
        if(str==null || str.length()<0){
            return null;
        }


        int j=str.length()-1;
      String res="";
        for(;j>=0;j--){
            res+=str.charAt(j);
        }
        return res;
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
