import java.util.Arrays;

public class LeetFizzBuzz {
    public static void main(String[] args) {
        String[] arr = fizzBuzz(15);
        System.out.println(Arrays.toString(arr));
    }
    static String[] fizzBuzz(int A) {
        // https://www.interviewbit.com/problems/fizzbuzz/
        String[] res = new String[A];
        for(int i = 1; i <= A; i++){
            if(i % 3 == 0 && i % 5 == 0){
                res[i-1] = "FizzBuzz";
            }else if(i % 3 == 0){
                res[i-1] = "Fizz";
            }else if(i % 5 == 0){
                res[i-1] = "Buzz";
            }else{
                res[i-1] = String.valueOf(i);
            }
        }
        return res;
    }
}
