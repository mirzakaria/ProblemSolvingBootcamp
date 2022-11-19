import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> in = Arrays.asList(
                Arrays.asList(1,0,5),
                Arrays.asList(1,1,7),
                Arrays.asList(1,0,3),
                Arrays.asList(2,1,0),
                Arrays.asList(2,1,1)
        );
        System.out.println(in.get(0).get(1));
        int n = 2;
        System.out.println(dynamicArray(n,in));

    }

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//        https://www.hackerrank.com/challenges/dynamic-array/problem
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            res.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (int i = 0; i < queries.size(); i++) {
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int idx = (x ^ lastAnswer) % n;
            if (queries.get(i).get(0) == 1) {
                res.get(idx).add(y);
            } else if (queries.get(i).get(0) == 2) {
                lastAnswer = res.get(idx).get(y % res.get(idx).size());
                result.add(lastAnswer);
            }
        }
        return result;
    }
}
