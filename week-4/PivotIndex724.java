public class PivotIndex724 {
    public static void main(String[] args) {
        int[] nums = {1,-1,2};
        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {
//        https://leetcode.com/problems/find-pivot-index/
        int leftSum = 0, rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftSum += nums[i-1];
                rightSum -= nums[i];
            }
            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
