import java.util.HashMap;

public class ValidAnagramLC {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "zakaria";

        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
//        https://leetcode.com/problems/valid-anagram/
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        if(s.length() != t.length()){
            return false;
        } else {
            for(int i = 0; i < s.length(); i++){

                if(!sMap.containsKey(s.charAt(i))){
                    sMap.put(s.charAt(i), 1);
                } else if (sMap.containsKey(s.charAt(i))) {
                    sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
                }

                if(!tMap.containsKey(t.charAt(i))){
                    tMap.put(t.charAt(i), 1);
                } else if (tMap.containsKey(t.charAt(i))) {
                    tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
                }
            }
            if(sMap.equals(tMap))
                return true;
            else
                return false;
        }
    }
}
