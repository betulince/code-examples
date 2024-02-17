package dataStructuresAndAlgorithms.binarySearch;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int midpoint = (low + high) / 2;
            if (target == nums[midpoint]) {
                return midpoint;
            }
            if (target < nums[midpoint]) {
                high = midpoint - 1;
            } 
            if (target > nums[midpoint]) {
                low = midpoint + 1;
            }
        }
        return low;
    }
}
