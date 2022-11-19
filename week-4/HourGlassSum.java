import java.util.Arrays;
import java.util.List;

public class HourGlassSum {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(-9, -9, -9, 1, 1, 1),
                Arrays.asList(0, -9, 0, 4, 3, 2),
                Arrays.asList(-9, -9, -9, 1, 2, 3),
                Arrays.asList(0, 0, 8, 6, 6, 0),
                Arrays.asList(0, 0, 0, -2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0)
                );
        System.out.println(hourglassSum(arr));

    }

    static int hourglassSum(List<List<Integer>> arr) {
//        https://www.hackerrank.com/challenges/2d-array/problem
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
//                System.out.println(sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
