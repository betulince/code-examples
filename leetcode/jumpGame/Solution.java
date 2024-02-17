public class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false;
            }
            if (i + nums[i] > maxIndex) {
                maxIndex = i + nums[i];
            }
            if (maxIndex >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}