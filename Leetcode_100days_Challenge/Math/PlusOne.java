package first_ideaprogram.src.Leetcode_100days_Challenge.Math;

import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        int [] digits1 = {1,2,3};
        int [] digits2 = {1,2,19};
        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

       
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }
}