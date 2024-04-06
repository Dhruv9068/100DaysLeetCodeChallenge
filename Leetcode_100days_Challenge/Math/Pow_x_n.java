package first_ideaprogram.src.Leetcode_100days_Challenge.Math;

public class Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000000,-10));
    }
        static double solve(double x, long n) {
            double ans = 1;
            while (n > 0) {
                if ((n & 1) == 1) {
                    ans *= x;
                }
                x *= x;
                n >>= 1;
            }
            return ans;
        }

        static double myPow(double x, int n) {
            if (x == 1) return 1;
            long N = n;
            return (n < 0) ? 1 / solve(x, -N) : solve(x, N);
        }
    }


