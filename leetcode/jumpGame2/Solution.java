public class Solution {
    public int jump(int[] nums) {

        int maxIndex = 0; // farthest index I can reach from my current position
        int jumpCount = 0;
        int currentIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (i + nums[i] > maxIndex) {
                maxIndex = i + nums[i];
            }

            if (i == currentIndex) { // means we reached the end of the current jump and need to make a new jump
                currentIndex = maxIndex;
                jumpCount++;
            }
        }
        return jumpCount;
    }
}