import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
    static boolean containsNearbyDuplicate(int[] nums, int k) {
//        https://leetcode.com/problems/contains-duplicate-ii/
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!mp.containsKey(nums[i])) {
                mp.put(nums[i], i);
            } else {
                if(i - mp.get(nums[i]) <= k){
                    return true;
                }
                mp.put(nums[i], i);
            }
        }
        return false;
    }
}
