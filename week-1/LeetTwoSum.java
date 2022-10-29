public class LeetTwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(twoSum(arr,9));
    }
    static int[] twoSum(int[] nums, int target) {
        // https://leetcode.com/problems/palindrome-number/
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                if (nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return null;
    }
}
