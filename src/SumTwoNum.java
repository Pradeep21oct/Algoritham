import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumTwoNum {

    public static void main(String[] args) {
      int intput[]={2,7,11,15};
        System.out.println(twoSum(intput,9));

    }

    private static int[] twoSum(int [] nums,int target){

        if(nums==null|| nums.length<2) throw  new IllegalArgumentException("No tow sum solutions");

        Map<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }
            map.put(nums[i],i);
        }
        throw  new IllegalArgumentException("No tow sum solutions");
    }
}
