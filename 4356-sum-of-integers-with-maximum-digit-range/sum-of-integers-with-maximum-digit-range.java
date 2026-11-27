
class Solution {
    public int maxDigitRange(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        int[] range = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            String num = nums[i] + "";
            char[] arr = num.toCharArray();

            Arrays.sort(arr);

            int diff = (arr[arr.length - 1] - '0') - (arr[0] - '0');

            range[i] = diff;
            max = Math.max(max, diff);
        }

        for (int i = 0; i < nums.length; i++) {
            if (range[i] == max) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
