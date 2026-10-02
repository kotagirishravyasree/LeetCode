class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        int sum = 0;

        while (n != 0) {
            long ld = n % 10;

            if (ld != 0) {
                sum += ld;
                x = (x * 10) + ld;
            }

            n = n / 10;
        }

        long rev = 0;

        while (x != 0) {
            long ld = x % 10;
            rev = (rev * 10) + ld;
            x = x / 10;
        }

        return rev * sum;
    }
}