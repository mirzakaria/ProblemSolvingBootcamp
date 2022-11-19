import java.util.Arrays;

public class MergeSort88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
//        https://leetcode.com/problems/merge-sorted-array/
        int[] leftArray = new int[m];
        int[] rightArray = new int[n];

        for (int i = 0; i < m; i++) {
            leftArray[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            rightArray[i] = nums2[i];
        }

        int i = 0, j = 0;
        int k = 0;
        while(i < m && j < n){
            if (leftArray[i] <= rightArray[j]){
                nums1[k] = leftArray[i];
                i++;
                k++;
            } else {
                nums1[k] = rightArray[j];
                j++;
                k++;
            }
        }
        while (i < m){
            nums1[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n){
            nums1[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
