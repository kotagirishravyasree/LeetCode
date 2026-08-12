class Solution {
    public boolean isHappy(int n) {

        int count = 0;

        while (n != 1 && count < 20) {

            int sum = 0;

            while (n != 0) {
                int ld = n % 10;
                sum += ld * ld;
                n = n / 10;
            }

            n = sum;
            count++;
        }

        return n == 1;
    }
}