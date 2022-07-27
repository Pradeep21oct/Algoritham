import java.util.HashSet;
import java.util.Set;

public class MatrixZero {

    public static void main(String[] args) {
        int a[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        matZero(a);
    }



    public static void matZero(int a[][]){
        Set <Integer>row=new HashSet();
        Set <Integer> col=new HashSet();

        for(int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }

       for(int r:row) {
           for (int j=0;j<a[r].length;j++){
               a[r][j]=0;
           }

       }


        for(int i=0;i< a.length;i++) {
            for (int c:col){
                a[i][c]=0;
            }

        }
        System.out.println("*******After*******");
        for(int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
