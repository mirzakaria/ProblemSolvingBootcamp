import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
    }
}
