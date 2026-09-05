class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;

        int[] prefMax = new int[len];
        int[] suffMin = new int[len];

        prefMax[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefMax[i] = Math.max(prefMax[i - 1], nums[i]);
        }

        
        suffMin[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
        }

        for (int i = 0; i < len; i++) {
            int insScore = prefMax[i] - suffMin[i];

            if (insScore <= k) {
                return i;
            }
        }

        return -1;
    }
}
