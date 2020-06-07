public class ReverseWords {

    public static void main(String arg []){
        String line = "Pradeep Kumar singh";
        System.out.println(reverse(line));
    }

    private static String reverse(String str){
        if(str==null || str.length()<2) return str;

        String st[]=str.split("\\W+");
        String finalStr="";
        for(int i=st.length-1;i>=0;i--){
            finalStr+=st[i]+" ";
        }
        return finalStr;
    }
}
