class Solution {
    public int trap(int[] height) {
        int ans = 0;
int[] lMax = new int[height.length];
int[] rMax = new int[height.length];

lMax[0] = 0;
int leftMax = 0;

for (int i = 1; i < lMax.length; i++) {
    leftMax = Math.max(leftMax, height[i - 1]);
    lMax[i] = leftMax;
}

rMax[rMax.length - 1] = 0;
int rightMax = 0;

for (int i = rMax.length - 2; i >= 0; i--) {
    rightMax = Math.max(rightMax, height[i + 1]);
    rMax[i] = rightMax;
}

for (int i = 0; i < height.length; i++) {
    ans += Math.max(0, Math.min(lMax[i], rMax[i]) - height[i]);
}

return ans;
        
        
    }
}