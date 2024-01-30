public class Solution {
    public void rotate(int[] nums, int k) {
        do {
            int lastElement = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = lastElement; // After shifting, the first position (index 0) becomes vacant, so the last element is placed at the beginning of the array.
            k--;
        } while (k > 0);

    }
}