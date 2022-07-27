import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {


    public static void main(String[] args) {
        Solution sol=new Solution();
      int nums[] = {3,2,4};
        int target = 6;
        for(int i: sol.twoSum(nums,target))
        System.out.println(i);
    }

    public int[] twoSum(int[] nums, int target) {
         if(nums.length==0)  throw new IllegalArgumentException("Size of must be > than zero");
         Map<Integer,Integer> datamap=new HashMap();


         int restlt[]=new int[2];
         for(int i=0;i<nums.length;i++){

             datamap.put(nums[i],i);
            //




         }


        Integer s=null;
        for(int i=0;i<nums.length-1;i++){
            Integer tempVar=target-nums[i];

             Integer sindex= datamap.get(tempVar);
              if(sindex!=null && i!=sindex ){
                  s=sindex;
                  restlt[0]=i;
                  restlt[1]=sindex;
                  break;
              }
        }



     return restlt;
    }

    static int getIndex(int[] nums, int target, int index){
        int indexval=index;
          for(int j=index+1; j< nums.length;j++){
              if(nums[j]==target){
                  indexval=j;
                  break;
              }

          }
          return indexval;
    }
}
