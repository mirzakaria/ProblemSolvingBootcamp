import java.util.HashMap;
import java.util.Map;

public class MajorityElementLC {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] nums){
//        https://leetcode.com/problems/majority-element/
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i]) + 1);
                if(mp.get(nums[i]) > nums.length / 2){
                    return nums[i];
                }
            }else{
                mp.put(nums[i], 1);
            }

        }
        return nums[0];
    }
}