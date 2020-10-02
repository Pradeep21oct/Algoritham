public class StringToNumber {
    public static void main(String[] args) {

        System.out.println(stringToNumber("87644"));

    }


    public static int stringToNumber(String s){
        boolean isnegative=false;
         if(s==null || s.isEmpty()) return 0;
         int i=0;
        if(s.charAt(0)=='-') {
            isnegative=true;
        }
        int n=0;
         for (char c: s.toCharArray()){
             n=n*10+c-'0';
         }
        if(isnegative) return -(n-'-');
        return n;

    }
}
