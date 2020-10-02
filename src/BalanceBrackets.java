import java.util.Objects;
import java.util.Stack;

public class BalanceBrackets {

    public static void main(String[] args) {

        String input="({[]})";
      System.out.println(isBalancev2(input));  ;
    }

    private static boolean isBalance(String input) {
        Stack <Character>stackFixLength=new Stack();

           if(input==null || input.length()<2){
               throw  new IllegalArgumentException("in-valid arguments");
           }
            for (int i = 0; i < input.length(); i++) {

                if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                    stackFixLength.push(input.charAt(i));
                }
                if (input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
                    if(stackFixLength.empty()) return false;

                    char b = stackFixLength.pop();
                    if (input.charAt(i) == ')' && b == '(' || input.charAt(i) == '}' && b == '{' || input.charAt(i) == ']' && b == '[') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }

        return stackFixLength.isEmpty();
    }

    private static boolean isBalancev2(String in){
        if(in==null ||in.length()%2!=0)return false;

        in=in.replace(" ","");
        int len=in.length();
        for(int i=0;i<len;i++){
            in=in.replace("()","");
            in=in.replace("{}","");
            in=in.replace("[]","");

        }
        return in.isEmpty();
    }
}
