import java.util.Arrays;

public class StringiFi {
    public static void main(String[] args) {
        String st="pradeep kumar singh ";
        System.out.println(stringiFy(st,19));
    }

    public static String stringiFy(String str, int size){

        int index=0;
        int spaceCount=0;


        char [] st=str.toCharArray();
        for(char c:st){
            if(c==' ') spaceCount++;
        }

        index=size+spaceCount*2;

        if(size<st.length) st[size]='\0';
         int i=0;
        for (i=size-1 ;i>0;i--){
            if (st[i]==' ') {
                st[index - 1] = '0';
                st[index - 2] = '2';
                st[index - 3] = '%';
                index = index - 3;
            }else {
                st[index-1]=st[i--];

        }

        }
        return Arrays.toString(st);
    }
}
