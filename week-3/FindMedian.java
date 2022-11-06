import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 1, 4, 2);
        System.out.println(findMedian(nums));
    }

    static int findMedian(List<Integer> arr) {
//        https://www.hackerrank.com/challenges/find-the-median/submissions/code/298674270

//        for(int i = 0; i < arr.size() - 1; i++){
//            for (int j = 0; j < arr.size() - i - 1; j++) {
//                if(arr.get(j) > arr.get(j + 1)){
//                    int temp = arr.get(j);
//                    arr.set(j, arr.get(j + 1));
//                    arr.set(j + 1 , temp);
//                }
//            }
//        }
        Collections.sort(arr);
        System.out.println(arr);
        return arr.get(arr.size() / 2);
    }
}
