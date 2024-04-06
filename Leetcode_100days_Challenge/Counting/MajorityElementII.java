package first_ideaprogram.src.Leetcode_100days_Challenge.Counting;
import java.util.*;
class MajorityElementII {
    public static void main(String[] args) {
        int [] nums ={3,2,3};
        System.out.println(majorityElement(nums));
    }
    static List<Integer> majorityElement(int[] nums) {
         Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

       for (int num : nums) {
           countMap.put(num, countMap.getOrDefault(num, 0) + 1);
       }


        int majorityCount = nums.length / 3;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) > majorityCount) {
                result.add(num);
            }
        }

        return result;
    }
}