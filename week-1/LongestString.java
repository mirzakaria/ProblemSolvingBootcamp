
public class LongestString {
    public static void main(String[] args) {
        String[] myString = {"I", "love", "my country", "very", "much"};
        String temp = myString[0];
        for (int i = 1; i < myString.length; i++){
            if(myString[i].length() > temp.length()) {
                temp = myString[i];
            }
        }
        System.out.println(temp);

    }
}
