import java.util.Arrays;
import java.util.List;

public class InsertionSortII {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,4,7,5,6,2,1);
        insertionSort2(7, arr);
    }
    static void insertionSort2(int n, List<Integer> arr) {
//        https://www.hackerrank.com/challenges/insertionsort2/problem
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && arr.get(j) < arr.get(j - 1)){
                int temp = arr.get(j);
                arr.set(j, arr.get(j - 1));
                arr.set(j - 1, temp);
                j--;
            }
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
