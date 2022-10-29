public class RevCharacters {
    public static void main(String[] args) {
        String myString = "I love programming";
        String res = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == ' '){
                //System.out.println(myString.substring(0, i) + ".");
                res += reverseWord(myString.substring(0, i)) + " ";
                myString = myString.substring(i+1, myString.length());
                i = 0;
            }else if(i == myString.length() - 1){
                //System.out.println(myString.substring(0, myString.length()) + ".");
                res += reverseWord(myString.substring(0, myString.length()));
            }
        }
        System.out.println(res);
    }
    static String reverseWord(String word){
        String rev = "";
        char ch[] = word.toCharArray();
        for (int k = ch.length - 1; k >= 0; k--){
            rev += ch[k];
        }
        return rev;
    }
}
