package leetcode.majorityElement
public class Solution {
    public int majorityElement(int[] nums) {

        // We can use Boyer-Moore Algorithm to find the majority of the element
        int candidate = nums[0];
        int count = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }
}
