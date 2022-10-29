import java.util.*;

public class AllDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }

    static List<Integer> findDuplicates(int[] nums) {
//        https://leetcode.com/problems/find-all-duplicates-in-an-array/
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(mp.containsKey(nums[i])){
                res.add(nums[i]);
                //mp.put(nums[i],1);
            }
            mp.put(nums[i],1);
        }
        return res;
    }
}

