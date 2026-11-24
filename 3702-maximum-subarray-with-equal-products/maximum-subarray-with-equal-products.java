class Solution {
    public int maxLength(int[] nums) {
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            long pro = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < nums.length; j++) {

                pro = pro * nums[j];

                gcd = gcd(gcd, nums[j]);

                lcm = (lcm * nums[j]) / gcd(lcm, nums[j]);

                if (pro == gcd * lcm) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}