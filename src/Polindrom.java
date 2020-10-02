public class Polindrom {
    public static void main(String st[]){
        String s="abcbaa";

        System.out.println(isPolidrom(s));
    }


    public static boolean isPolidrom(String str){

        if(str==null) return false;

        int i=0;
        int j=str.length()-1;

        while(i<j){
            if( str.charAt(i++)!=str.charAt(j--)) return false;
        }

        return true;

    }



}
