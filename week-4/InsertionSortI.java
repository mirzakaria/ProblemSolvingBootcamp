import java.util.Arrays;
import java.util.List;

public class InsertionSortI {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,4,5,6,7,8,9,10,1);
        insertionSort1(10, arr);
    }

    static void insertionSort1(int n, List<Integer> arr) {
//        https://www.hackerrank.com/challenges/insertionsort1/problem
        int temp = arr.get(n-1);
        int i;
        for(i = n - 2; i >= 0; i--){
            if(temp < arr.get(i)){
                arr.set(i + 1, arr.get(i));
                for(int x: arr){
                    System.out.print(x+" ");
                }
                System.out.println();
            } else {
                arr.set(i + 1, temp);
                for(int x: arr){
                    System.out.print(x+" ");
                }
                System.out.println();
                break;
            }
        }
        if(i < 0) {
            arr.set(i + 1, temp);
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
