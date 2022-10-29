import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LeftRotationHR {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = rotateLeft(4, arr);
        System.out.println(result);

    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//        https://www.hackerrank.com/challenges/array-left-rotation/problem
        // Write your code here
        List<Integer> res =  new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++){
            res.add(i, arr.get((i + d) % arr.size()));
        }
        return res;

    }
}
