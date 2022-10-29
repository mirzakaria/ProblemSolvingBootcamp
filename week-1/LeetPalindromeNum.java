public class LeetPalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3123));
    }
    static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        //bool res = true;
        for (int i = 0; i < num.length()/2; i++){
            if(num.charAt(i) != num.charAt(num.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
