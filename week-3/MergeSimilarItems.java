import java.util.*;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int nums1[][] = {
                {1, 3},
                {2, 2}
                //{3, 8}
        };
        int nums2[][] = {
                {7, 1},
                {2, 2},
                {1, 4}
        };
        System.out.println(mergeSimilarItems(nums1, nums2));
//        mergeSimilarItems(nums1, nums2);
    }
    static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
//        https://leetcode.com/problems/merge-similar-items/
        Map<Integer, Integer> mp = new TreeMap<>();

        for (int i = 0; i < items1.length; i++) {
            if(!mp.containsKey(items1[i][0])){
                mp.put(items1[i][0], items1[i][1]);
            }
        }
        for (int i = 0; i < items2.length; i++) {
            if(!mp.containsKey(items2[i][0])){
                mp.put(items2[i][0], items2[i][1]);
            } else {
                mp.put(items2[i][0], mp.get(items2[i][0]) + items2[i][1]);
            }
        }
        List<List<Integer>> listOfLists = new ArrayList<>(mp.keySet().size());
        for(Integer in: mp.keySet()){
            List<Integer> ls = new ArrayList<>();
            ls.add(in);
            ls.add(mp.get(in));
            listOfLists.add(ls);
        }
        return listOfLists;
    }
}
