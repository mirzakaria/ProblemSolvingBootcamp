import java.util.Arrays;

public class RemoveDuplicate26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] nums) {
        int k = 0, j = 1;
        for (int i = 0; i < nums.length;) {
            nums[k] = nums[i];
            k++;
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            i = j;
        }

        return k;
    }
}
