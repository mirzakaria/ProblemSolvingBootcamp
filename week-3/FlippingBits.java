public class FlippingBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(4294967295L));
//        flippingBits(9);
    }

//    static long flippingBits(long n) {
//        https://www.hackerrank.com/challenges/flipping-bits/problem
//        return 4294967295L - n;
//    }
    static long flippingBits(long n){
//        https://www.hackerrank.com/challenges/flipping-bits/problem
        int rem;
        long[] arr = new long[32];
        int i = 31;
        while(n > 0){
            arr[i] = n % 2;
            n = n / 2;
            i--;
        }
        long res = 0;
        for (int j = 0; j < arr.length; j++) {
            //System.out.print(arr[j]);
            arr[j] = arr[j] == 0 ? 1 : 0;
            if(arr[j] == 1){
                res += arr[j] * Math.pow(2, (31-j));
            }
        }
        return res;
    }
}
