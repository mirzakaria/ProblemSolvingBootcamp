import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        miniMaxSum(nums);
    }

    static void miniMaxSum(List<Integer> arr) {
//        https://www.hackerrank.com/challenges/mini-max-sum/problem
        long min = 0, max = 0;
        for (int i = 1; i < arr.size(); i++) {
            int temp;
            if(arr.get(i - 1) > arr.get(i)){
                temp = arr.get(i - 1);
                arr.set(i - 1, arr.get(i));
                arr.set(i, temp);
            }
        }
//        System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            min += arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            int temp;
            if(arr.get(i - 1) < arr.get(i)){
                temp = arr.get(i - 1);
                arr.set(i - 1, arr.get(i));
                arr.set(i, temp);
            }
        }
//        System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            max += arr.get(i);
        }
        System.out.println(min + " " + max);

    }
}
