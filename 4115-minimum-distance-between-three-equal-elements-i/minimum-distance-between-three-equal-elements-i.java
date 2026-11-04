import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.putIfAbsent(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
        }

        int min = Integer.MAX_VALUE;

        for (List<Integer> list : hm.values()) {
            if (list.size() >= 3) {
                for (int i = 0; i <= list.size() - 3; i++) {
                    int a = list.get(i);
                    int b = list.get(i + 1);
                    int c = list.get(i + 2);

                    int distance = 2 * (c - a);

                    min = Math.min(min, distance);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}