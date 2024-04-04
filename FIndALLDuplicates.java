package first_ideaprogram.src.Leetcode_100days_Challenge;
import java.util.*;
public class FIndALLDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if(nums[val - 1] < 0) {
                result.add(val);
            }else {
                nums[val - 1] *= -1;
            }
        }
        return result;
    }
}
