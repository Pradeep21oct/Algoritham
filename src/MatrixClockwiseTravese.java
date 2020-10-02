public class MatrixClockwiseTravese {

    public static void main(String[] args) {
        int a[][]={{1,2,3,11},{4,5,6,12},{7,8,9,13}};
        System.out.println(traversal(a));
    }

    public static String traversal(int a[][]){

        if(a==null||a.length==0)return null;

       StringBuilder sb=new StringBuilder();
        boolean visited[][]=new boolean[a.length][a[0].length];
        int fr=0,fc=0,lr=a.length-1,lc=a[0].length-1;
        String dir="R";

        while (fr<=lr&& fc<=lc){


            if("R".equals(dir)){

            for(int i=0;i<=lc;i++) {
                if(!visited[fr][i]) {
                    visited[fr][i] = true;
                    sb.append(a[fr][i]+" ");
                }

            }
              fr++;
            dir="D";
            }


            if("D".equals(dir)){

                for(int i=0;i<=lr;i++) {
                    if(!visited[i][lc]) {
                        visited[i][lc] = true;
                        sb.append(a[i][lc]+" ");
                    }

                }
              lc--;
                dir="L";
            }


            if("L".equals(dir)){

                for(int i=lc;i>=0;i--) {
                    if(!visited[lr][i]) {
                        visited[lr][i] = true;
                        sb.append(a[lr][i]+" ");
                    }

                }
                lr--;
                dir="U";
            }

            if("U".equals(dir)){

                for(int i=lr;i>=0;i--) {
                    if(!visited[i][fc]) {
                        visited[i][fc] = true;
                        sb.append(a[i][fc]+" ");
                    }

                }
               fc++;
                dir="U";
            }
        }



        return sb.toString();

    }

}
