import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SockMerchant {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        System.out.println(sockMerchant(arr.size(), arr));

    }

    static int sockMerchant(int n, List<Integer> ar){
//        https://www.hackerrank.com/challenges/sock-merchant/problem
        int count = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer num : ar){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }
        for(Integer in : map.values()){
            count += in / 2;
        }
        return count;
    }
}
