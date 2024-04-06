package first_ideaprogram.src.Leetcode_100days_Challenge.Counting;

// This code implements the "Boyer-Moore Voting Algorithm" to find the majority element in an array.
 class MajorityElement {
    public static void main(String[] args) {
        int [] arr= {3,2,3};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}