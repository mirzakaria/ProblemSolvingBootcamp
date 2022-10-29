public class InterviewBWordRev {
    public static void main(String[] args) {
        System.out.println(solve("   the sky is blue"));
    }
    static String solve(String A) {
        // https://www.interviewbit.com/problems/reverse-the-string/
        String res = "";
        int len = A.length();
        for(int i = len - 1; i >= 0; i--){
            while(i >= 0 && A.charAt(i) == ' '){
                i--;
            }
            int j = i;
            while(i >= 0 && A.charAt(i) != ' '){
                i--;
            }
            if(A.isEmpty()){
                res +=  A.substring(i+1, j+1);
            }else{
                res += " " + A.substring(i+1, j+1);
            }
        }
        return res;
    }
}
