import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArraysDSHR {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = reverseArray(arr);
        System.out.println(result);
    }

    public static List<Integer> reverseArray(List<Integer> a) {
//        https://www.hackerrank.com/challenges/arrays-ds/problem
        List<Integer> re = new ArrayList<Integer>();
        for(int i = 0; i < a.size() ; i++){
            re.add(i, a.get(a.size() - 1 - i));
        }

        return re;
    }
}
