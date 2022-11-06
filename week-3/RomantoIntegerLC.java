import java.util.HashMap;
import java.util.Map;

public class RomantoIntegerLC {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s){
//        https://leetcode.com/problems/roman-to-integer/
        int res = 0;
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int oldValue = Integer.MIN_VALUE;
        for (int i = s.length() - 1; i >=0 ; i--) {
            if(mp.get(s.charAt(i)) < oldValue){
                res -= mp.get(s.charAt(i));
            }else {
                res += mp.get(s.charAt(i));
            }
            oldValue = mp.get(s.charAt(i));
        }
        return res;
    }

}
