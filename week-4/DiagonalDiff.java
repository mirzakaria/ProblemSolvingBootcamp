import java.util.Arrays;
import java.util.List;

public class DiagonalDiff {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,2,2), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
        System.out.println(diagonalDifference(arr));
    }
    static int diagonalDifference(List<List<Integer>> arr) {
//        https://www.hackerrank.com/challenges/diagonal-difference/problem
        int firstSum = 0, secSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            firstSum += arr.get(i).get(i);
            secSum += arr.get(i).get(arr.size() - i - 1);
        }
        int difference = firstSum - secSum;
        if(difference >= 0){
            return difference;
        } else {
            return difference * -1;
        }
    }

}
