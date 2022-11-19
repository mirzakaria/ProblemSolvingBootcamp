import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        moveZeroes(arr);
    }
//    https://leetcode.com/problems/move-zeroes/
    static void moveZeroes(int[] nums) {
//        int insertPos = 0;
//        for (int num: nums) {
//            if (num != 0) nums[insertPos++] = num;
//        }
//        System.out.println(Arrays.toString(nums));
//        while(insertPos < nums.length){
//            nums[insertPos] = 0;
//            insertPos++;
//        }
//        System.out.println(Arrays.toString(nums));

//        int lastIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length) {
                    if (nums[j] != 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        System.out.println(Arrays.toString(nums));
                        break;
                    }
                    j++;
                }
            }
        }
    }
}
