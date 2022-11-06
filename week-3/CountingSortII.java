import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSortII {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 5, 1, 2, 99, 5, 99, 98, 99));
        System.out.println(countingSort(li));
    }

    static List<Integer> countingSort(List<Integer> arr) {
//        https://www.hackerrank.com/challenges/countingsort2/problem
        List<Integer> ls = new ArrayList<>(Collections.nCopies(100, 0));
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
//            int value = arr.get(i);
            ls.set(arr.get(i), ls.get(arr.get(i)) + 1);
        }
        int j = 0;
        for (int i = 0; i < ls.size(); i++) {
            int value = ls.get(i);
            if(value > 0){
                while(value > 0){
                    res.add(j, i);
                    j++;
                    value--;
                }
            }
        }
        return res;
    }
}
