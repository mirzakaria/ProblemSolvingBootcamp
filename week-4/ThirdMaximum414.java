import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdMaximum414 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(thirdMax(arr));
    }

    static int thirdMax(int[] nums) {
//        https://leetcode.com/problems/third-maximum-number/
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if (!ls.contains(nums[i])) {
                ls.add(nums[i]);
            }
        }

        Collections.sort(ls, Collections.reverseOrder());
        if (ls.size() >= 3) {
            return ls.get(2);
        } else {
            return ls.get(0);
        }
    }
}
