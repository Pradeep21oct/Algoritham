import java.util.ArrayList;
import java.util.List;

public class CoinProblem {
    public static void main(String[] args) {


        List<Integer> coins=new ArrayList<>();
        coins.add(5);
        coins.add(2);
        coins.add(1);
        System.out.println( minNum(coins,45));

    }

    public static int minNum(List <Integer> coin,int target) {
        int sum = 0;

        int counter = 0,i=0;
        while (i < coin.size()) {
          sum=sum+coin.get(i);
          counter++;
          if(sum<target) continue;
          if(sum==target) break;
          if(sum>target) {
              sum=sum-coin.get(i);
              i++;
              counter--;
          }
        }
        return counter;
    }

}
