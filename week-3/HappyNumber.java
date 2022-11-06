import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static boolean isHappy(int n) {
        List<Integer> ls = new ArrayList<>();
        while (true){
            if(ls.contains(n)){
                return false;
            }
            ls.add(n);
            int sum = 0;
            String st = Integer.toString(n);
            for (int i = 0; i < st.length(); i++) {
                int value = Character.getNumericValue(st.charAt(i));
                sum += value * value;
            }
//            System.out.println(sum);
            n = sum;
            if (n == 1) {
                return true;
            }
        }
    }
}
