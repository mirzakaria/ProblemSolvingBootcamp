import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSumLC{
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    static int[] twoSum(int[] nums, int target) {
	//https://leetcode.com/problems/two-sum/
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            
            if(mp.containsKey(target - nums[i])){
                return new int[] {mp.get((target - nums[i])), i};
            }
            mp.put(nums[i], i);
        }
        return new int[] {};
    }
}