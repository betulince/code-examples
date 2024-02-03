class Solution {
    public int trap(int[] height) {

        int water = 0;

        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                water += leftMax - height[left++];
            } else {
                water += rightMax - height[right--];
            }
        }
        return water;
    }
}