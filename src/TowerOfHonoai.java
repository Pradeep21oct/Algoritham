public class TowerOfHonoai {

    public static void main(String[] args) {
        TowerOfHonoai tower=new TowerOfHonoai();
        tower.towerHanoi(4,"A","B","C");
    }


    public void towerHanoi(int n,String from,String aux,String to){
        if(n==1){
            System.out.println("Disk 1 from tower "+from+ " To  " +to);
            return;
        }
        towerHanoi(n-1,from,to,aux);
        System.out.println("Disk "+n+ " from tower  "+from + " to "+ to);
        towerHanoi(n-1,aux,from,to);
    }
}
