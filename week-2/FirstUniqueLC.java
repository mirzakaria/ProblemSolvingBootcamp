import java.util.HashMap;
import java.util.Map;

public class FirstUniqueLC {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }

    static int firstUniqChar(String s){
//        https://leetcode.com/problems/first-unique-character-in-a-string/
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }else{
                mp.put(s.charAt(i),mp.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(mp.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
