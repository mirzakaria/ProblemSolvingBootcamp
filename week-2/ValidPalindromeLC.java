public class ValidPalindromeLC {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
        //isPalindrome(str);
    }

    static boolean isPalindrome(String s){
//        https://leetcode.com/problems/valid-palindrome/
        String st = s.replaceAll("[^a-zA-Z0-9]", "");
        st = st.toLowerCase();

        for(int i = 0; i < st.length() / 2; i++){
            if(st.charAt(i) != st.charAt(st.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
