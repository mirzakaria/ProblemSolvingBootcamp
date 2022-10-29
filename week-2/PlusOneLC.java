import java.util.Arrays;

public class PlusOneLC {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] digits){
//        https://leetcode.com/problems/plus-one/
        int sum = 0;
        int carry = 1;
        int[] res = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            //res[i] = digits[i] + carry;
            if(digits[i] + carry == 10) {
                res[i] = 0;
                carry = 1;
            }else {
                res[i] = digits[i] + carry;
                carry = 0;
            }
        }
        if(res[0] == 0){
            int[] newres = new int[res.length + 1];
            newres[0] = 1;
            return newres;
        }
        return res;
    }
}
